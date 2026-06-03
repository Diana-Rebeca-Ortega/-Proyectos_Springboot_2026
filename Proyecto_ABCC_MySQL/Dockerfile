# Usar una imagen base de Java
FROM eclipse-temurin:17-jdk-jammy
# Copiar el archivo jar generado a la imagen
COPY target/*.jar app.jar
# Exponer el puerto
EXPOSE 8080
# Comando para ejecutar
ENTRYPOINT ["java","-jar","/app.jar"]
