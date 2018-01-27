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

# Documentation sur la gestion des Properties Sources

https://www.mkyong.com/spring/spring-propertysources-example/

http://javaetmoi.com/2014/06/spring-framework-java-configuration/

https://docs.spring.io/spring/docs/3.0.0.M3/reference/html/ch04s11.html

https://examples.javacodegeeks.com/enterprise-java/spring/load-environment-configurations-and-properties-with-spring-example/

http://javasampleapproach.com/spring-framework/inject-properties-using-value-annotations-vs-environment-vs-configurationproperties

