FROM openjdk:17
#TimeZone package
#ENV TZ Africa/Nairobi

#mainetainer label
#LABEL maintainer = "integration@smartapplicationsgroup.com"

#volume
#VOLUME /INTEG/Integration

# Make port 8401 available to the world outside this container
EXPOSE 8409

#The fLat File
ARG JAR_FILE=target/*.jar

#Add applications'jar to the container
ADD ${JAR_FILE} docs-integration-ug-app-qa.jar

RUN mkdir -p /DocsUgApp

#run the jar file
ENTRYPOINT ["java","-jar","/docs-integration-ug-app-qa.jar"]