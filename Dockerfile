FROM openjdk:17
EXPOSE 8080
ADD target/JPA-Mapping.jar JPA-Mapping.jar
ENTRYPOINT ["java","-jar","/JPA-Mapping.jar"]