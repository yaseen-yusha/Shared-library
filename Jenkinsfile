@Library('Shared-library') _
pipeline{
  agent any
  stages{
    stage('scm'){
      gitcheckout
    }
    stage('mvn'){
      mavenTest
    }
  }
}

