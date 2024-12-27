pipeline {
    agent any
    tools {
        maven 'Maven' // Name you configured in Jenkins
    }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Siddhant40/javafile.git' // Replace with your repo URL
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
                withSonarQubeEnv('SonarQube') { // Replace with your SonarQube server name
                    sh 'mvn sonar:sonar -Dsonar.projectKey=SampleMavenProject'
                }
            }
        }
    }
}
