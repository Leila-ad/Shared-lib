def call(Map config = [:]){
    script {
        env.CONTAINER_FILE_PATH = config.containerFilePath == null ? "Dockerfile" : config.containerFilePath
    }

    println "${BUILD_VERSION} and the ${CONTAINER_FILE_PATH}"
}
