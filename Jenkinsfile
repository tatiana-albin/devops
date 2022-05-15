pipeline {
    agent { 
        docker { image 'openjdk:8-jdk-alpine' } 
    }
    stages {
        stage('build') {
            steps {
                sh 'java -version'
            }
        }
    }
}
