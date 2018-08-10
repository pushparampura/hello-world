pipeline {
    agent any
    stages { 
        stage('Example Compile') {
            steps {
	    withMaven(maven: 'maven1'){
	         sh 'mvn compile'
                echo 'Hello World'
            }
        }
    }
        stage('Example Test') {
            steps {
	    withMaven(maven: 'maven1'){
	    sh 'mvn test'
                echo 'Hello World'
            }
        }
    }
}
}
