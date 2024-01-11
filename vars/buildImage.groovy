def call(Map pipelineConfig = [:]){
    env.CONTAINER_FILE_PATH = pipelineConfig.containerFilePath ?: 'Containerfile'

    println "${CONTAINER_FILE_PATH}"
    println "${pipelineConfig.containerFilePath}"
}
