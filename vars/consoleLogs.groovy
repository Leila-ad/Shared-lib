def call(Map config = [:]) {

  GITSHORTHASH  = getGitShortHash()
  TIMESTAMP     = "21.12.2023"

  Map test = [
    GITSHORTHASH: GITSHORTHASH,
    TIMESTAM: TIMESTAMP,
    *:config
  ]
  script {
    echo """
    test.collect({key, value -> "$key: [$value]"})
    """
  }
}