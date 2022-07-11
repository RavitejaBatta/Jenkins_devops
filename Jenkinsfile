pipeline {
	agent any
	//agent { docker { image 'maven:3.6.3' } }
	//git url: "https://github.com/RavitejaBatta/Jenkins_Repo.git", branch: "main", credentialsId:'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'
	git credentialsId: 'd0423571-8af2-4d96-a3ae-df1a95c668e5', url: 'https://github.com/RavitejaBatta/Jenkins_devops'
	environment{
		dockerHome = tool 'myDocker'
		mavenHome = tool 'myMaven'
		PATH = "$dockerHome/bin:$mavenHome/bin:$PATH"
	}
	
	stages{
		stage('Checkout') {
			steps{
				sh 'mvn --version'
				sh 'docker version'
				echo "Build"
				echo "$PATH"
				echo "BUILD_NUMBER - $env.BUILD_NUMBER"
				echo "BUILD_ID - $env.BUILD_ID"
				echo "JOB_NAME - $env.JOB_NAME"
				echo "BUILD_TAG - $env.BUILD_TAG"
			}
		}
		stage('Compile') {
			steps{
				sh 'mvn clean compile'
			}
		}
		
		stage('Test') {
			steps{
				sh 'mvn test'
			}
		}

		stage('Integration Test') {
			steps{
				sh 'mvn failsafe:integration-test failsafe:verify'
			}
		}

		/*stage('Package') {
			steps{
				sh 'mvn package -DskipTests'
			}
		}*/

		/*stage('Build Docker Image') {
			steps{
				//docker build -t myjenkins/jenkinsmicroService:$env.BUILD_TAG
				script{
					dockerImage = docker.build("jenkinservice/jenkinsmicroservice:$env.BUILD_TAG")
				}
			}
		}

		stage('Push Docker Image') {
			steps{
				script{
                    docker.withRegistry('','dockerhub'){
					dockerImage.push();
					dockerImage.push('latest');
					}
				}
			}
		}*/
	} 
	
	post{
        always{
			echo 'I run always'
		}
		success{
			echo 'I run when you are success'
		}
		failure{
			echo 'I run when you fail'
		}
		//unstable: When the test failure happens
	}
}
