FROM openjdk:8
EXPOSE 8080
ADD target/springboot-gitaction-workflow.jar springboot-gitaction-workflow.jar
ENTRYPOINT ["java","-jar","/springboot-gitaction-workflow.jar"]