#!/usr/bin/env groovy

def call(String imageName){
 def lib = library('jenkins-shared-library').com.example
 return lib.Docker.new(this).buildDockerImage(imageName)
}