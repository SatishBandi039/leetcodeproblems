pipeline {
    agent {
        docker {
            image 'amazoncorretto:17'
            args '-v c:/program files/amazon corretto' // Correct Docker volume format for Maven cache persistence
        }
    }

    tools {
        maven "M3"
    }

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/SatishBandi039/leetcodeproblems.git'
                bat "mvn -Dmaven.test.failure.ignore=true clean package"  // Use "sh" in Linux container // Use "bat" in windows container
            }
            post {
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}
