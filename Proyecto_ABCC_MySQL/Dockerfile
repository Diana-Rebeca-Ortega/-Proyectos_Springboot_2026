# Usar una imagen base de Java
FROM openjdk:17-jdk-slim
# Copiar el archivo jar generado a la imagen
COPY target/*.jar app.jar
# Exponer el puerto
EXPOSE 8080
# Comando para ejecutar
ENTRYPOINT ["java","-jar","/app.jar"]