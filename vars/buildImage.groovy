#!/usr/bin/env groovy
@Library('jenkins-shared-library')
import com.example.Docker

def call(String imageName){
 return new Docker(this).buildDockerImage(imageName)
}