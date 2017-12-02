# jenkins-web-internet

URL Localhost : http://localhost:8080/artifact-web/index.jsp

# Mise à jour informations git

git config --global user.name "ibmdev"

git config --global user.email "ibmdev102017@gmail.com"

# Build Jenkins

## Batch Windows

echo ********************** Start Build EAR ***************************************
mvn clean install
echo ********************** Deploy EAR  ***************************************
echo ********************** Starting server JBOSS EAP 6.3 ***************************************
start cmd.exe @cmd /k F:\developpement\git\Jenkins\jboss-eap-6.3\bin\standalone.bat

## Script Shell

echo ********************** END Jenkins JOB  ***************************************
curl --request POST -u admin:admin "http://localhost:8180/jenkins/job/jenkins-web-internet/lastBuild/stop"
