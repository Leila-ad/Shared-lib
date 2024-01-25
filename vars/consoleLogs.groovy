def call(Map config = [:]) {

  GITSHORTHASH  = getGitShortHash()
  TIMESTAMP     = "21.12.2023"
  
  def arr = ["TIMESTAMP: [${TIMESTAMP}]", "GIT SHORT HASH: [${GITSHORTHASH}]"]
  config.each{key, value ->
    arr.append("$key: [$value]")
  }
  script {
    echo """
      ${for a in arr; do
        $a
      done
      }
    """
  }
}