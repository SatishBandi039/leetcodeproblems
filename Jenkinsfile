pipeline {
    // agent any  // Uses the Jenkins agent itself
        agent {
          docker {
            image 'jenkins-windows-java-maven'
          }
        }

       tools {
           jdk 'JAVA'  // Must be configured in Jenkins Global Tool Configuration
           maven 'M3'
       }

    stages {
         stage('Checkout') {
            steps {
                git 'https://github.com/SatishBandi039/leetcodeproblems.git'
                }
         }
        stage('Build') {
            steps {
                // git 'https://github.com/SatishBandi039/leetcodeproblems.git'
                bat "mvn -B clean package"  // Use "sh" in Linux container // Use "bat" in windows container
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
                junit '**/target/surefire-reports/TEST-*.xml' // Publish JUnit results
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
