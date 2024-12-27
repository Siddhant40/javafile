pipeline {
    agent any
    tools {
        maven 'Maven' // Name you configured in Jenkins
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url:'https://github.com/Siddhant40/javafile.git' // Replace with your repo URL
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
                    environment {
                        SONAR_TOKEN = credentials('SonarQube')
                    }
                    steps {
                        // Debug environment variables and print current directory
                                       
                        // Use the full path for sonar-scanner.bat
                        bat '''
                          -Dsonar.projectKey=java-maven ^
                          -Dsonar.projectname=java-maven ^
                          -Dsonar.sources=. ^
                          -Dsonar.host.url=http://localhost:9000 ^
                          -Dsonar.token=%SONAR_TOKEN% ^
                          -Dsonar.verbose=true
                        '''
                    }
                }
            }
        }
    }
}
