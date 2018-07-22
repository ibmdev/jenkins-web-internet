# jenkins-web-internet

```xml
URL Localhost : http://localhost:8080/artifact-web/index.html
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

## Google Analytics Fundamentals

# GA Account Structure and Administration

Login : ibmdev102017
Tracking ID : UA-122653423-1

Next course : "Hits, Sessions, and Users" p6
Reports and Data Structures in GA p7
https://analytics.google.com/analytics/academy/course/6/unit/1/lesson/3





