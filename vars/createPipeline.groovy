def call(Map config = [:], Map customEnv = [:], Closure customStages = {}) {
    def buildNumber = env.BUILD_NUMBER as int
    if (buildNumber > 1) milestone(buildNumber - 1)
    milestone(buildNumber)

pipeline {
    agent any
    
    environment {
        CLOSURE_VAR = "Closure varibale"
    }
    
    stages {    

        stage ('Configuration') {
            steps {
                echo "${getGitShortHash()}"
                echo "${env.BUILD_NUMBER} and the ${env.TAG_NAME}"
                echo "${getSemanticVersion()}"
                buildImage(config)
            }
        }
        stage ("String interpolation") {
            steps {
                echo "$env.VAR"
            }
        }
        stage ("Uebergeben von Variablen in shell") {
            steps {
                echo '$env.Variable'
            }
        }
    }
}
}