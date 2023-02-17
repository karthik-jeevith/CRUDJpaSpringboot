FROM openjdk:11

COPY target/exceptionrestapi-0.0.1-SNAPSHOT.jar exceptionrestapi-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/exceptionrestapi-0.0.1-SNAPSHOT.jar"]