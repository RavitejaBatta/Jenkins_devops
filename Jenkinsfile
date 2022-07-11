node {
  git credentialsId: 'd0423571-8af2-4d96-a3ae-df1a95c668e5', url: 'https://github.com/RavitejaBatta/Jenkins_devops'
  stage ('Checkout') {
    svn 'https://svn.mycorp/trunk/'
    stage 'Build'
    sh 'make all'
    stage 'Test'
    sh 'make test'
  }
}