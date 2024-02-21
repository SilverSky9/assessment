# Build Stage
FROM gradle:latest AS builder
WORKDIR /app
COPY build.gradle .
COPY settings.gradle .
COPY src ./src
RUN gradle build

# Runtime Stage
FROM amazoncorretto:17.0.10-al2023
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]