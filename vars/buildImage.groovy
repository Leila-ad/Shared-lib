def call(Map config = [:]){
    env.CONTAINER_FILE_PATH = config.containerFilePath ?: 'Containerfile'

    println "${CONTAINER_FILE_PATH}"
    println "${config.containerFilePath}"
}
