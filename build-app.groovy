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
                bat """
                    cd ${env.WORKSPACE}\\src\\main\\java\\hello\\build\\libs\\
                    git add .
                    git commit -m "new jar pushed"
                    git push origin main                    
                """
            }
        }
    }
}