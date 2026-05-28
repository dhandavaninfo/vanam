FROM eclipse-temurin:21-jdk
EXPOSE 8091
ADD target/vanam.jar vanam.jar
ENTRYPOINT [ "java","-jar","/vanam.jar" ]
