pipeline {
    agent any
    tools {
        maven 'maven1' 
    }
    stages {
        stage('Example') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}
