pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                bat 'mvn --version'
            }
        }
        stage('test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('package') {
            steps {
                bat 'mvn package'
            }
        }
        stage('build') {
            steps {
                bat 'mvn deploy'
            }
        }
    }
}
