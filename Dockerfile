FROM amazoncorretto:17-alpine

WORKDIR /app

COPY target/school-service-1.0.0.jar app.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "app.jar"]