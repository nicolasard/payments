FROM openjdk:11
COPY target/PaymentsApp-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 9099