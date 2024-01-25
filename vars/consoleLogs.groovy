def call(Map config = [:]) {

  GITSHORTHASH  = getGitShortHash()
  TIMESTAMP     = "21.12.2023"

  Closure extraLogs = {
    config.each{key, value ->
      "$key: [$value] \n"
    }
  }

  script {
    echo """
      TIMESTAMP: [${TIMESTAMP}]
      GIT SHORT HASH: [${GITSHORTHASH}]
      ${extraLogs()}
    """
  }
}