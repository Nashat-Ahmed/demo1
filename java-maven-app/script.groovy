def buildJar() {
    echo "building the application..."
    sh 'mvn package'
} 

def buildImage() {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t nashaat111/webapp:jma-1.1 .'
        sh "docker login -u $USERNAME -p $PASSWORD"
        sh 'docker push nashaat111/wepapp:jma-1.1'
    }
} 

def deployApp() {
    echo 'deploying the application...'
} 

return this
