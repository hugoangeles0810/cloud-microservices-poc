FROM maven:3.5-jdk-8 as BUILD

WORKDIR /opt/app

ADD pom.xml .

RUN ["/usr/local/bin/mvn-entrypoint.sh", "mvn", "dependency:go-offline"]

ADD . .

RUN ["mvn", "package"]

FROM openjdk:8-jdk-alpine

WORKDIR /opt

COPY --from=BUILD /opt/app/target/*.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]