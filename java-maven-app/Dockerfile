FROM maven:3.8.6-openjdk-17-slim AS build

WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline -B

COPY src/ /app/src/
RUN mvn package -DskipTests

FROM openjdk:17-jdk-slim

WORKDIR /app

COPY --from=build /app/target/java-maven-app-1.0-SNAPSHOT.jar /app/java-maven-app.jar

EXPOSE 8080

CMD ["java", "-jar", "java-maven-app.jar"]

