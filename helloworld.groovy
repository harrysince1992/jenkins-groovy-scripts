pipeline {
    agent any

    stages{
        stage("print hello world"){
            steps{
                echo "Hello world there!!"
            }
        }
    }
}