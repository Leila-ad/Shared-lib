def call(Map config = [:]) {

  GITSHORTHASH  = getGitShortHash()
  TIMESTAMP     = "21.12.2023"
  Closure extraLog = {
    return config.each{key, value -> 
      $key: [$value]
      }}
  script {
    echo """
      TIMESTAMP: [${TIMESTAMP}]
      GIT SHORT HASH: [${GITSHORTHASH}]
      ${extraLog()}
    """
  }
}