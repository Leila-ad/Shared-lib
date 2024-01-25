def call(Map config = [:]) {

  GITSHORTHASH  = getGitShortHash()
  TIMESTAMP     = "21.12.2023"
  
  script {
    echo """
      TIMESTAMP: [${TIMESTAMP}]
      GIT SHORT HASH: [${GITSHORTHASH}]
      ${
        for key in ${config.keySet()}; 
        do
          $key: [$config[key]]
        done
      }
    """
  }
}