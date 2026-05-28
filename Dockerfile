FROM openjdk:21
EXPOSE 8091
ADD target/vanam.jar vanam.jar
ENTRYPOINT [ "java","-jar","/vanam.jar" ]
