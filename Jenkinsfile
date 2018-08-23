pipeline {
    agent any
    triggers {
        pollSCM('* * * * *')
    }
    stages {
        stage('build') {
            steps {
                bat 'mvn -version'
            }
        }
        stage('clean') {
            steps {
                bat 'mvn clean'
            }
        }
        stage('package') {
            steps {
                bat 'mvn package'
            }
        }
        stage('test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('deploy') {
            steps {
                bat 'mvn deploy'
            }
        }
    }                
}
