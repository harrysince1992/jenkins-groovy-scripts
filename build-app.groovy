pipeline {
    agent any 

    stages{
        stage("build app"){
            steps{
                echo "Building app using gradle"
                bat """
                    cd src\\main\\java\\hello
                    gradle build
                    """
            }
        }
        stage("Push the war that is created to git"){
            steps{
                echo "Pushing the jar file to github repo ${env.GIT_URL}"
            }
        }
    }
}