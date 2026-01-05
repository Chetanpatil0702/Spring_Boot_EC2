FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY target/Spring_Boot_EC2-0.0.1-SNAPSHOT.jar Spring_Boot_EC2.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "Spring_Boot_EC2.jar"]
