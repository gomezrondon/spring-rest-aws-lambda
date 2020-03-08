FROM openjdk:alpine
ADD /build/libs/spring-gcp-run-0.0.1-SNAPSHOT.jar app.jar
ADD cert.json cert.json
ENTRYPOINT ["java","-Dspring.profiles.active=cloud","-jar","/app.jar"]