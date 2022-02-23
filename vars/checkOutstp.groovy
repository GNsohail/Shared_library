#!/usr/bin/env groovy

def call(String gitrep, String branchname) {
    checkout([$class: 'GitSCM', branches: [[name: "${branchname}"]], extensions: [], userRemoteConfigs: [[url: "${gitrep}"]]])
}
