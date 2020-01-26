
FROM openjdk:8-jdk-alpine

COPY /build/libs/*.jar app.jar

RUN sh -c 'touch app.jar'

ENTRYPOINT ["java","-jar","app.jar"]
