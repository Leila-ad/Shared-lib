def call(Closure passEnv = {}, Map config = [:]) {
    def buildNumber = env.BUILD_NUMBER as int
    if (buildNumber > 1) milestone(buildNumber - 1)
    milestone(buildNumber)

pipeline {
    agent any
    
    passEnv()
    
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
                echo "$env.Variable"
                echo "$env.Var"
                echo "$Var"
                echo "env.Variable"
                echo "env.Var"
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