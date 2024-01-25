def call(Map config = [:]) {

  GITSHORTHASH  = getGitShortHash()
  TIMESTAMP     = "21.12.2023"
  
  Map test = [
    *:config
  ]

  script {
    echo """
    GIT_SHORT_HASH : [${GITSHORTHASH}]
    TIMESTAMP      : [${TIMESTAMP}]
    ${test.collect({key, value -> "$key: [$value]"})}
    """
  }
}