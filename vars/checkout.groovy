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
