def call(){
    return sh(script:"npm pkg get version", returnStdout: true).trim()
}