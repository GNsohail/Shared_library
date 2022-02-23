#!/usr/bin/env groovy

def call(String gitrep) {
    checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: "${gitrep}"]]])
}
