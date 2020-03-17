FROM openjdk:8-alpine

COPY target/uberjar/helloworld.jar /helloworld/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/helloworld/app.jar"]
