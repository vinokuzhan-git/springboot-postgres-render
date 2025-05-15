FROM openjdk:17-jdk-slim
VOLUME /tmp
WORKDIR /app
COPY target/employee-service.jar app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]