def call(Map config = [:]) {

  GITSHORTHASH  = getGitShortHash()
  TIMESTAMP     = "21.12.2023"

  Closure extraLogs = {
    def keyVal
    config.each{key, value ->
      keyVal = "$key: [$value] \n"
    }
    return keyVal
  }

  script {
    echo """
      TIMESTAMP: [${TIMESTAMP}]
      GIT SHORT HASH: [${GITSHORTHASH}]
      ${extraLogs()}
    """
  }
}