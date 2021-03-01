# README #

Workshop to demonstrate how we can code to using sonar and snyk to identiy code and security issues.

Complete code can be found here: `https://github.com/maddy-10x/demo.git`

You can clone this repository using,
`git clone https://github.com/maddy-10x/demo.git`

You can also download the repository from `https://github.com/maddy-10x/demo.git`

### Setup ###

In to run Sonar and Snyk, we need the following installed on your PC.
* Java8 
* Maven
* IntelliJ
* Node
* Docker
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

### Node ###

Get from https://nodejs.org/en/


### Sonar ###

You can run a sonar server locally using,

`docker run -d --name sonarqube -p 80:9000 sonarqube:community`

Access http://localhost and follow the instructions.
Add a Project to generate a token, which will be used when performing sonar analysis.

There is one Sonar Instance setup for those who might need, 
http://35.223.77.178/

Credentials:
admin / madhav123
Token: 83fad61fdf19794d41ce52b0994b0611758a0153

### Sonar Analysis ###

Execute the following to analyze the project.

´mvn compile org.sonarsource.scanner.maven:sonar-maven-plugin:3.6.0.1398:sonar   -Dsonar.projectKey=YSYS-Demo   -Dsonar.host.url=http://35.223.77.178   -Dsonar.login=83fad61fdf19794d41ce52b0994b0611758a0153 -Dsonar.sources=src/main/java -Dsonar.language=java -Dsonar.java.binaries=target/classes´

Analyze sonar Reports and fix the following code issues,

* Duplicate code issues
* Nullpointer issues
* Unnecessary Assignments
 
### Sonarlint plugin ###

Install a sonar lint plugin in IntelliJ. 

Demonstrate real time Sonar linting with IntellJ.

### Snyk test ###

Follow the instructions to install snyk
https://support.snyk.io/hc/en-us/articles/360003812458-Getting-started-with-the-CLI

Run the snyk test with,

`snyk test`

To generate a report of vulnurabilities,

`snyk monitor`

Analyze the Snyk issues

Fix the snyk issues

Ignore snyk issues with .snyk file.
