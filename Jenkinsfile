pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                bat 'mvn -version'
                bat 'mvn clean'
                bat 'mvn package'
                bat 'mvn deploy'
                         
        }
        
}
