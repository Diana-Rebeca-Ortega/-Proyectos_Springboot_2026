# ETAPA 1: Construcción (Aquí compilamos el proyecto)
FROM eclipse-temurin:17-jdk-jammy AS build
# Copiamos todo el código fuente al contenedor
COPY . .
# Ejecutamos Maven para compilar y generar el archivo .jar
# El -DskipTests es para ahorrar tiempo y evitar fallos por pruebas
RUN ./mvnw clean package -DskipTests

# ETAPA 2: Ejecución (Aquí creamos la imagen final ligera)
FROM eclipse-temurin:17-jdk-jammy
# Copiamos solo el archivo .jar generado en la etapa anterior
COPY --from=build /target/*.jar app.jar
# Exponemos el puerto de Spring Boot
EXPOSE 8080
# Comando para ejecutar la aplicación
ENTRYPOINT ["java","-jar","/app.jar"]
