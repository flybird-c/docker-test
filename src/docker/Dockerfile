FROM openjdk:8
WORKDIR /app
COPY ./target/docker-*.jar docker-test.jar
EXPOSE 8080
CMD ["java", "-jar", "docker-test.jar"]
