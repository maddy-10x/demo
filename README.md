# README #

Please follow this document to setup your machine and practice for the workshop

You can clone this repository using,
`git clone https://mannapureddy@bitbucket.org/mannapureddy/demo.git`

### Setup ###

* Java8 
* Maven
* IntelliJ
* Sonar
* Snyk

### Install Java8 ###

Follow instructions
https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html

### Install Maven ###

Follow the instructions
https://maven.apache.org/install.html

### IntelliJ - IDE ###

Download from: https://www.jetbrains.com/idea/download/


### Sonar ###

You can setup sonar either locally or on a VM or use the provided link.

### Sonar in VM ###
You can setup sonar on your machine or a VM as follows

I am using GCP VM Ubuntu 16.04

* Install docker

Follow https://dev.to/chefgs/install-docker-on-ubuntu-16-04-3igm

* Install docker-compose

https://www.digitalocean.com/community/tutorials/how-to-install-docker-compose-on-ubuntu-16-04

* Run sonar docker image

`docker run -d --name sonarqube -p 80:9000 sonarqube:community`

### Sonar Locally ###
`docker run -d --name sonarqube -p 80:9000 sonarqube:community`
Add a Project to generate a token, which will be used when performing sonar analysis

### Use a Sonar ###
http://35.223.77.178/
admin / madhav123


### To Do App ###

Pre-requisite: Java8, Maven, Node

Execute the following to analyze the project

´mvn compile org.sonarsource.scanner.maven:sonar-maven-plugin:3.6.0.1398:sonar   -Dsonar.projectKey=YSYS-Demo   -Dsonar.host.url=http://35.223.77.178   -Dsonar.login=83fad61fdf19794d41ce52b0994b0611758a0153 -Dsonar.sources=src/main/java -Dsonar.language=java -Dsonar.java.binaries=target/classes´
 
### Sonarlint plugin ###

Install in IntelliJ

### Snyk test ###

Follow the instructions to install snyk
https://support.snyk.io/hc/en-us/articles/360003812458-Getting-started-with-the-CLI