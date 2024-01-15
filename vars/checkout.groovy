/*
Maintainer: Jayaprakashnarayana.reddy@pearson.com
version: v0.1
Description: Function to checkout code from bitbucket

List of Arguments:
branch: The Branch to clone
credentialsID: ID of credentials stored in jenkins
dirPath: The directory where to clone the repository
url: Complete Bitbucket repository url to clone
*/

def call(body) {
    try {
    dir("${body.dirPath}") {
    git branch: "${body.branch}", credentialsId: "${body.credentialsID}", url: "${body.url}"
    }
    sh " ls -lrt ${body.dirPath}"
    }
  catch (err) {
    currentBuild.result = 'FAILED'
    throw err
  }
}
