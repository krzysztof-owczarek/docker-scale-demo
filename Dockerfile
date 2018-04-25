FROM openjdk:8-jre-alpine
WORKDIR /
COPY target/dockerScaleDemo-1.0-SNAPSHOT.jar dockerScaleDemo-1.0-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT exec java -jar dockerScaleDemo-1.0-SNAPSHOT.jar
