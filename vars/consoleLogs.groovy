def call(Map config = [:]) {

  GITSHORTHASH  = getGitShortHash()
  TIMESTAMP     = "21.12.2023"

  script {
    def arr = config.each{key, value -> 
      "$key: [$value]"
    }
    echo """
      TIMESTAMP: [${TIMESTAMP}]
      GIT SHORT HASH: [${GITSHORTHASH}]
      ${arr}
      ${config.each{key, value -> "$key: [$value]"}}
      $(config.each{key, value -> "$key: [$value]"})
    """
  }
}