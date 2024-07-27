FROM openjdk:21
ADD target/wm-employer-service.jar wm-employer-service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "wm-employer-service.jar"]