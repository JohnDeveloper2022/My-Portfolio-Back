
FROM alpine:latest
MAINTAINER johnmaster
COPY target/backend-0.0.1-SNAPSHOT.jar backend-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/backend-0.0.1-SNAPSHOT.jar"]
ENV PORT = 8080
EXPOSE 8080
