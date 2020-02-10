# boot-observability
Set of sample apps demonstrating how to write observable applications or microservices using 
SpringBoot.

# Required Software

* Install Java 11 JDK [https://adoptopenjdk.net/](https://adoptopenjdk.net/)
* Install a recent version of your favourite Java IDE
    * [IntelliJ IDEA](https://www.jetbrains.com/idea/download) 
    * [Spring Tool Suite for Eclipse](https://spring.io/tools)
* Optional Download [Grafana](https://grafana.com/grafana/download) we will set it up during the workshop
 
# Building the application 

run `./mvnw clean package` in the project root to download dependencies and build sample apps. If 
you have multiple versions of Java JDK installed you will likely need to set your JAVA_HOME 
environment variable to point to your JDK 11 installation. 
