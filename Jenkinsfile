pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                bat 'mvn --version'
            }
            steps {
                bat 'mvn clean'
            }
            steps {
                bat 'mvn package'
            }
            steps {
                bat 'mvn test'
            }
            
        }
        
    }
}
