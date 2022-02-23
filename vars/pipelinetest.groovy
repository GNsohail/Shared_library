#!/usr/bin/env groovy
def call(String gitrep, String branchname) {
pipeline {
    agent any
    stages {
stage('Demo') {
steps {
  //echo 'Hello World'

  //sayHello 'Dave'
  checkout([$class: 'GitSCM', branches: [[name: "*/${branchname}"]], extensions: [], userRemoteConfigs: [[url: "${gitrep}"]]]) 
  sh 'ls vars/'
}
}

}
}
}
