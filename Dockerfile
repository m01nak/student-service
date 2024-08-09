FROM eclipse-temurin:17-ubi9-minimal
WORKDIR /app
COPY target/student-service-0.1.jar student-service-0.1.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "student-service-0.1.jar"]