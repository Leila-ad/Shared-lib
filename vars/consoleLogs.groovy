def call(Map config = [:]) {

  GITSHORTHASH  = getGitShortHash()
  TIMESTAMP     = "21.12.2023"
  
  Map test = [
    GIT_SHORT_HASH : [$GITSHORTHASH],
    TIMESTAMP      : [$TIMESTAMP]
  ]

  script {
    echo "${test}"
  }
}