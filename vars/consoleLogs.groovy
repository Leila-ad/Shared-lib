def call(Map config = [:]) {

  GITSHORTHASH  = "324565423"
  TIMESTAMP     = "21.12.2023"

  script {
    return """
      TIMESTAMP: [${TIMESTAMP}]
      GIT SHORT HASH: [${GITSHORTHASH}]
    """
  }
}