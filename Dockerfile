FROM openjdk:8
EXPOSE 8080
ADD target/spring-docker-3.jar spring-docker-3.jar
ENTRYPOINT ["java","-jar","/spring-docker-3.jar"] 