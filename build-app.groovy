pipeline {
    agent any 

    stages{
        stage("build app"){
            steps{
                echo "Building app using gradle"
                bat """
                    cd src\\main\\java\\hello
                    gradle build"""
            }
        }
        stage("show the war that is created"){
            steps{
                echo "war version created" 
            }
        }
    }
}