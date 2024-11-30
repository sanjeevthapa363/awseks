FROM amazoncorretto:23

WORKDIR /app

COPY target/springboot-eks.jar /app

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/springboot-eks.jar"]