#!/usr/bin/env groovy

def calL(){
    echo "Building the docker image"
    withCredentials([usernamePassword(credentialsId: 'docker-credentials', passwordVariable: 'PASS', usernameVariable: 'USER')]){
        sh 'mvn -Pprod jib:dockerBuild -Dimage=zmitser/my-repo:1.0'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh "docker push zmitser/my-repo:1.0"
    }
}