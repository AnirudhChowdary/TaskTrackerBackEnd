FROM java:8 AS build
EXPOSE 8080
ADD target/TaskTrackerBackEnd.jar TaskTrackerBackEnd.jar
ENTRYPOINT ["java","-jar","TaskTrackerBackEnd.jar"]