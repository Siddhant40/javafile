pipeline {
    agent any
    tools {
        maven 'Maven' // Name you configured in Jenkins
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Siddhant40/javafile.git' // Replace with your repo URL
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('SonarQube Analysis') {
            environment {
                SONAR_TOKEN = credentials('SonarQube') // Add SonarQube token credential in Jenkins
            }
            steps {
                bat """
                    sonar-scanner ^
                    -Dsonar.projectKey=java-maven ^
                    -Dsonar.projectName=java-maven ^
                    -Dsonar.sources=. ^
                    -Dsonar.host.url=http://localhost:9000 ^
                    -Dsonar.login=%SONAR_TOKEN% ^
                    -Dsonar.verbose=true
                """
            }
        }
    }
    post {
        success {
            echo 'Build and analysis completed successfully!'
        }
        failure {
            echo 'Build or analysis failed!'
        }
        always {
            echo 'This will always run, regardless of success or failure.'
        }
    }
}
