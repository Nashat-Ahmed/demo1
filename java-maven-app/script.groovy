def buildJar() {
    echo "building the application..."
    sh 'mvn package'
} 

def buildImage() {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t ahmedabdoahmed/demo-app-for-maven:jma-1.0 .'
        sh "docker login -u $USERNAME -p $PASSWORD"
        sh 'docker push ahmedabdoahmed/demo-app-for-maven:jma-1.0'
    }
} 

def deployApp() {
    echo 'deploying the application...'
} 

return this
