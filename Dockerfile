FROM openjdk:17
EXPOSE 8080
ADD target/jpamapping.jar jpamapping.jar
ENTRYPOINT ["java","-jar","/jpamapping.jar"]
