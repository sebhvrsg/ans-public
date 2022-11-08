FROM eclipse-temurin:11.0.17_8-jre

ARG JAR_FILE
COPY ${JAR_FILE} /app/APP.jar

ENTRYPOINT ["java","-jar","/app/APP.jar"]