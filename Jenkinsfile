pipeline {

    agent any
<<<<<<< HEAD

    stages{

        stage('Build'){

            steps {

                sh 'mvn clean package'

=======
    stages {
        stage('Build') {
            steps {
                echo 'Building'
>>>>>>> 61cc31836875ceb65272f2d118f992d5d748adee
            }

            post {

                success {

                    echo 'Now Archiving...'

                    archiveArtifacts artifacts: '**/target/*.war'

                }

            }

        }
<<<<<<< HEAD

        stage ('Deploy to Staging'){

            steps {

                build job: 'Deploy-to-staging'

=======
        stage('Test') {
            steps {
                echo 'Testing'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying'
>>>>>>> 61cc31836875ceb65272f2d118f992d5d748adee
            }

        }

    }
<<<<<<< HEAD

=======
>>>>>>> 61cc31836875ceb65272f2d118f992d5d748adee
}
