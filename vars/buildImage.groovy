#!/usr/bin/env groovy
@Library('somelib')
import com.example.Docker

def call(String imageName){
 return new Docker(this).buildDockerImage(imageName)
}