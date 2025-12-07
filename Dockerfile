FROM eclipse-temurin:21-jdk-alpine
LABEL authors="Mi"

WORKDIR /agoraLearn

COPY build/libs/AgoraLearn-1.jar AgoraLearn-1.jar

ENTRYPOINT ["java", "-jar", "AgoraLearn-1.jar"]