pipeline {
    agent any
    tools {
        maven 'Maven 3.8.1' // Use the Maven name configured in Jenkins
    }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Siddhant40/javafile.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SonarQube') { // SonarQube server name in Jenkins
                    sh 'mvn sonar:sonar -Dsonar.projectKey=<project-key>'
                }
            }
        }
    }
}