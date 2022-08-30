pipeline{
    agent any
    tools{
        maven 'maven_3_8_1'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Karan-Daiict/devops-automation']]])
                sh 'mvn clean install'
            }
        }
        stage('Build Docker Image'){
            steps{
                script{
                    sh 'docker build -t 123karan890/devops-automation .'
                }
            }
        }
        stage('Push docker image to hub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerhub-pwd-1', variable: 'dockerhubpwd')]) {
                        sh 'docker login -u 123karan890 -p ${dockerhubpwd}'
                    }
                    sh 'docker push 123karan890/devops-automation'
                }
            }
        }
    }
}