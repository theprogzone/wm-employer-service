# Use a multi-stage build to minimize image size
# Build Stage
FROM maven:4.0.0-openjdk-21-slim AS build
COPY . .
RUN mvn clean install -DskipTests

# Runtime Stage
FROM openjdk:21
ADD target/wm-employer-service.jar wm-employer-service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "wm-employer-service.jar"]