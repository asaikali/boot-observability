# boot-observability
Set of sample apps demonstrating how to write observable applications or microservices using 
SpringBoot.

# Required Software

* Install Java 11 JDK [https://adoptopenjdk.net/](https://adoptopenjdk.net/)
* Install a recent version of your favourite Java IDE
    * [IntelliJ IDEA](https://www.jetbrains.com/idea/download) 
    * [Spring Tool Suite for Eclipse](https://spring.io/tools)
* Download [Zipkin Server .jar](https://repo1.maven.org/maven2/io/zipkin/zipkin-server/2.19.3/zipkin-server-2.19.3-exec.jar) 
  from maven central and place into  
* Download [Prometheus](https://prometheus.io/download/) 
    * The first package called prometheus is required. 
    * Alert manager and other components of prometheus are not required, no need to download them.
* Download [Grafana](https://grafana.com/grafana/download) we will set it up during the workshop
 
# Building the application 

run `./mvnw clean package` in the project root to download dependencies and build sample apps. If 
you have multiple versions of Java JDK installed you will likely need to set your JAVA_HOME 
environment variable to point to your JDK 11 installation. 
