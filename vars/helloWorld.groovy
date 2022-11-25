def call(Map config = [:]){
    bat "echo hello ${config.name} and ${config.description}"
}