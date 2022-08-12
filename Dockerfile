FROM openjdk:17-alpine
EXPOSE 8004
COPY target/Policy.jar Policy.jar
ENTRYPOINT ["java","-jar","/Policy.jar"]