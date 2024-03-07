def call() {
    try {
        // Run Maven clean install
        sh 'mvn clean install'
    } catch (Exception e) {
        // Handle any exceptions or errors that occur during the build process
        echo "Maven build failed: ${e.message}"
        currentBuild.result = 'FAILURE'
    }
}

