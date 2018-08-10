pipeline {
    agent any
    stages { 
        stage('Example clean') {
            steps {
                withMaven(maven:'maven1'){
                    bat 'mvn clean'
                echo 'Hello World'
                }
            }
           
        }
        stage('Example') {
            steps {
                echo 'Hello World'
            }    
        }
    }
}
