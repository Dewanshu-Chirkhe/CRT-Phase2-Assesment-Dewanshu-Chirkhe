# Q19: Docker image for the Spring Boot application.
# Build command: docker build -t myapp:latest .
# Run command: docker run -p 8080:8080 myapp:latest

FROM eclipse-temurin:21-jre
COPY target/app.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
