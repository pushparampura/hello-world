pipeline {

    agent any

    stages{

        stage('Build'){

            steps {

                sh 'mvn clean package'
    stages {
        stage('Build') {
            steps {
                echo 'Building'
            }

            post {

                success {

                    echo 'Now Archiving...'

                    archiveArtifacts artifacts: '**/target/*.war'

                }

            }

        }

        stage ('Deploy to Staging'){

            steps {

                build job: 'Deploy-to-staging'

        stage('Test') {
            steps {
                echo 'Testing'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying'
            }

        }

    }
}
