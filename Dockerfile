#imagen base con su alias llamado builder
FROM maven:3.8.3-openjdk-17 as builder
# crea una carpeta en el contenedor y te ubica dentro de la carpeta
WORKDIR /usr/home/app
# copia todo el proyecto de maquina hacia el contenedor
COPY ./ ./
# ejecuto el comando para crear los paquetes de mi proyecto(mvn clean install)
RUN mvn -e -B package

# imagen para ejecutar la aplicacion
FROM eclipse-temurin:17-jdk-alpine
# creamos variabe de entorno JAVA_OPTS
ENV JAVA_OPTS ''
# copiamos el jar de nuestro proyecto de un determinado stage(builder)
COPY --from=builder /usr/home/app/app-cambista-api-configuracion/target/*.jar app.jar
EXPOSE 8092
ENTRYPOINT ["sh", "-c", "java  $JAVA_OPTS -jar /app.jar"]



