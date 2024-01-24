def call(Map config = [:], Closure extraLog = {}) {

  GITSHORTHASH  = getGitShortHash()
  TIMESTAMP     = "21.12.2023"

  script {
    echo """
      TIMESTAMP: [${TIMESTAMP}]
      GIT SHORT HASH: [${GITSHORTHASH}]
      ${extraLog.key}:[${extraLog.value}]
    """
  }
}