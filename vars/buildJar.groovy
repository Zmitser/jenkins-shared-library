#!/usr/bin/env groovy

def call(){
    echo "Building application for branch $BRANCH_NAME"
    sh 'mvn package'
}