pipeline {
    agent any
    stages {
stage('Demo') {
steps {
  //echo 'Hello World'

  //sayHello 'Dave'
  checkOutstp "https://github.com/GNsohail/Shared_library.git","main" 
  sh 'ls vars/'
}
}

}
}
