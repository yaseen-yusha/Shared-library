@Library('Shared-library') _
pipeline{
  agent any
  stages{
    stage('scm'){
      steps{
       gitcheckout() 
      }
    }
    stage('maven'){
      steps{
        mavenTest()
      }  
    }
  }
}

