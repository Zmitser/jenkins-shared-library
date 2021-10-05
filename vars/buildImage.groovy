#!/usr/bin/env groovy

def call(String imageName){
    echo "Building the docker image"
    withCredentials([usernamePassword(credentialsId: 'docker-credentials', passwordVariable: 'PASS', usernameVariable: 'USER')]){
        sh "mvn -Pprod jib:dockerBuild -Dimage=$imageName"
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh "docker push $imageName"
    }
}