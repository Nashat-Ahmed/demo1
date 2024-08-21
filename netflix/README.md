# Netflix-like Application

This is a basic Netflix-like application built with Node.js and Express. The application is containerized using Docker and can be deployed to a Kubernetes cluster. This README provides step-by-step instructions to set up, run, and deploy the application.
## Prerequisites

Before you begin, ensure you have the following installed on your system:

- [Node.js](https://nodejs.org/) (v14 or higher)
- [Docker](https://www.docker.com/)
- [Kubernetes](https://kubernetes.io/) (Minikube for local development)
- [Jenkins](https://www.jenkins.io/)
- [Git](https://git-scm.com/)

## Application Structure

The application is structured as follows:
netflix-app/
├── src/
│ └── app.js
├── test/
│ ├── unit/test.js
├── k8s/
│ ├── deployment.yaml
│ └── service.yaml
├── Dockerfile
├── Jenkinsfile
├── package.json
└── README.md



## Installation

 **Clone the repository:**

  
- git clone https://github.com/Nashat-Ahmed/demo1.git
- cd netflix-app



## Install Node.js dependencies:
- npm install

## Run the following command to create` package.json` and install Express:
- npm init -y
- npm install express

### You can add test cases using a testing framework like Mocha:
- npm install mocha chai --save-dev

## Build The Docker Image
- docker build -t netflix-app:latest .

## Run The Container 
- docker run -p 3000:3000 netflix-app:latest

### DockerHub login
- docker login -u your-dockerhub-username -p your-dockerhub-password

### Tag The Image
- docker tag netflix-app:latest your-dockerhub-username/netflix-app:latest

### Pushing The Docker Image
- docker push your-dockerhub-username/netflix-app:latest

# Apply Kubernetes Manifests
- kubectl apply -f k8s/deployment.yaml
- kubectl apply -f k8s/service.yaml

##Access the Application
- minikube service netflix-app-service

#  Running the CI/CD Pipeline with Jenkins
Create a new Jenkins pipeline job.
Configure the pipeline to use your `Jenkinsfile` from the Git repository.
