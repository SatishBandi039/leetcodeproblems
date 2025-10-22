pipeline {
    agent any  // Uses the Jenkins agent itself
       tools {
           jdk 'JAVA'  // Must be configured in Jenkins Global Tool Configuration
           maven 'M3'
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
