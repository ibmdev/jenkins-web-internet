# jenkins-web-internet

```xml
URL Localhost : http://localhost:8080/artifact-web/index.jsp
```

# Mise à jour informations git

```xml
git config --global user.name "ibmdev"

git config --global user.email "ibmdev102017@gmail.com"
```

# Build Jenkins

```xml
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
```

## Batch Windows

```xml
mvn clean install -Dbuild=jenkins
```

## Script Shell

```xml
curl --request POST -u admin:admin "http://localhost:8180/jenkins/job/jenkins-web-internet/lastBuild/stop"
```

# Suppression Configuration Jenkins sur Mac OS X

```xml
sudo rm -rf /var/root/.jenkins ~/.jenkins
```

# Angular CLI

1) Installation gloable de Angular-CLI 
npm install -g @angular/cli

2) Création d'une nouvelle structure de projet Angular
ng new artifact-web

# Rangle.io

https://angular-2-training-book.rangle.io/handout/testing/intro-to-tdd/setup/karma-config.html

https://stackoverflow.com/questions/38532210/how-to-integrate-angular-2-java-maven-web-application






