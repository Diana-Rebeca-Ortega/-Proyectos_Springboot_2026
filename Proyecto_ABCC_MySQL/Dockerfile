# ETAPA 1: Construcción
FROM eclipse-temurin:17-jdk-jammy AS build
COPY . .
RUN ./mvnw clean package -DskipTests

# ETAPA 2: Ejecución
FROM eclipse-temurin:17-jdk-jammy
COPY --from=build /target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
