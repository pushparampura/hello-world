pipeline{
    agent any
    parameters {
        string(defaultValue: "develop", description: 'enter the branch name to use', name: 'BRANCH_NAME')
    }
    stages{
        stage('Checkout'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: "*/${BRANCH_NAME}"]], gitTool: 'jgit', userRemoteConfigs: [[url: "https://github.com/pushparampura/hello-world.git"]]])
                //checkout([$class: 'GitSCM', branches: [[name: "*/${BRANCH_NAME}"]],url:'https://github.com/brianmyers/hello'])
            }
        }
    }
}
