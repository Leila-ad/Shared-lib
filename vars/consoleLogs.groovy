def call(Map config = [:]) {

  GITSHORTHASH  = getGitShortHash()
  TIMESTAMP     = "21.12.2023"

  script {
    echo """
    GIT_SHORT_HASH : [${GITSHORTHASH}]
    TIMESTAMP      : [${TIMESTAMP}]
    ${config.collect("" as String){key, value -> "$key: [$value]"}}
    """
  }
}