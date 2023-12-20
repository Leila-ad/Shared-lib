def call(Map config = [:]) {

  GITSHORTHASH  = "324565423"
  TIMESTAMP     = "21.12.2023"

  script {
    echo """
      "Timestamp: [${TIMESTAMP}]"
      "git short hash: [${GITSHORTHASH}]"
    """
  }
}