def call(Map config = [:]) {

  GITSHORTHASH  = getGitShortHash()
  TIMESTAMP     = "21.12.2023"

  Closure extraLog = {
    config.each{key, value -> 
      return "$key: [$value]"
      }}

  script {
    echo """
      TIMESTAMP: [${TIMESTAMP}]
      GIT SHORT HASH: [${GITSHORTHASH}]
      ${extraLog()}
    """
  }
}