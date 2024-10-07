FROM openjdk:17
EXPOSE 8081
ARG JAR_FILE=target/*.jar
COPY ./target/docker-k8-assignment-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]