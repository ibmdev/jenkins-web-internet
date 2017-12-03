# jenkins-web-internet

URL Localhost : http://localhost:8080/artifact-web/index.jsp

# Mise à jour informations git

git config --global user.name "ibmdev"

git config --global user.email "ibmdev102017@gmail.com"

# Build Jenkins

Software Requirements : 
JDK : 8
ANT : 1.10.1
Maven : 3.5
settings.xml : 

<activeProfiles>
			<activeProfile>dev</activeProfile>
			<activeProfile>jenkins</activeProfile>
</activeProfiles>

Repository local : file:///F:\developpement\git\Jenkins\jenkins-web-internet
Nom de la branche courante : */master

## Batch Windows

echo ********************** Start Continuous Integration ***************************************
mvn clean install -Dbuild=jenkins

## Script Shell

echo ********************** Stop Jenkins JOB  ***************************************

curl --request POST -u admin:admin "http://localhost:8180/jenkins/job/jenkins-web-internet/lastBuild/stop"
