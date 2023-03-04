pipeline {
    agent any
    tools {
       maven 'maven-3.8.6'
    }
    stages {
        stage('buil Maven') {
            steps {
              checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/fouss98/ApiExam']])

                bat 'mvn clean install'
            }
        }
        stage('Build') {
            steps {
                script {

                    bat 'docker build -t devops-integration .'
                }

         }
         }
        /* stage('Push ver dockerhub') {
            steps {
                withCredentials([string(credentialsId: 'pwdder', variable: 'pwdDer')]) {
                    bat 'docker login -u fouss98 -p 47517127@'

                }

                        bat 'docker login -u fouss98 -p 47517127@'



                bat 'docker push devops-integration'
            }
        }*/
    }
}
