pipeline {
    agent any
    
    stages {
        stage('Example') {
            steps {
                withMaven(maven: 'maven1') {
                    sh 'mvn --version'
                    sh 'mvn clean test'
                }
                    
                sh 'mvn --version'
            }
        }
    }
}
