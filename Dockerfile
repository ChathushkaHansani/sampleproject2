from java:8
expose 8080
add /target/sample-project2-1.0-SNAPSHOT.jar /opt/sample-project2-1.0-SNAPSHOT.jar
workdir /opt
entrypoint ["java","-jar","sample-project2-1.0-SNAPSHOT.jar"]