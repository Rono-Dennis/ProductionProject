# we will use openjdk 8 with alpine as it is a very small linux distro
# FROM openjdk:8-jre-alpine3.9
 
# copy the packaged jar file into our docker image
# COPY target/docs-integration-0.0.1.jar /docs-integration.jar
 
# set the startup command to execute the jar
# CMD ["java","-Djava.security.egd=file:/dev/./urandom", "-jar", "/docs-integration.jar"]

# #Use spark core
# FROM 192.180.4.103:5000/sparkcore:1.0

# RUN apk add --no-cache tzdata
# ENV TZ Africa/Nairobi

# # Add Maintainer Info
# LABEL maintainer="itambo.ibrahim@gmail.com"

# # Add a volume pointing to /tmp
# VOLUME /tmp

# # Make port 8761 available to the world outside this container
# EXPOSE 8080

# # The fat jar
# ARG JAR_FILE=target/eureka-client-0.1.jar

# # Add the application's jar to the container
# ADD ${JAR_FILE} eureka-client.jar

# # Run the jar file
# ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/eureka-client.jar"]

#  docker build --pull --rm -f "Dockerfile" -t abacus-ms-edi-claimdoc-uap:latest "." 
#  docker tag abacus-ms-edi-claimdoc-uap:latest 192.180.4.122:5000/abacus-ms-edi-claimdoc-uap:latest
#  docker push 192.180.4.122:5000/abacus-ms-edi-claimdoc-uap:latest

# #Aftermath
# #========================================
# #Build
# #docker build -t 192.180.4.103:5000/eurekaclient:0.1 .

# #Push
# #docker push 192.180.4.103:5000/eurekaclient:0.1

# #Docker Test

# #docker run --name eurekaclient -d -p 8080:8080 192.180.4.103:5000/eurekaclient:0.1
# #docker service create --replicas 3 --name eureka-client-service -p 38080:8080 192.180.4.103:5000/eurekaclient:0.1

# #Pod / TESTING
# #kubectl apply -f docs/pod.yml

# #Deployment
# #kubectl apply -f docs/deployment.yml

# #Service
# #kubectl apply -f docs/service.yml

#FROM openjdk:8-jdk-alpine
#RUN  apk add --no-cache tzdata ttf-dejavu && ln -sf /usr/share/zoneinfo/Africa/Nairobi /etc/localtime  && echo "Africa/Nairobi" > /etc/timezone
#LABEL maintainer = "john.wati@smartapplicationsgroup.com"
## Add a volume pointing to /tmp
#VOLUME /tmp
## Make port 9820 available to the world outside this container
#RUN apk add --update
##--------------
#RUN apk add --update update && apt-get install -y vim
#RUN echo "deb http://us-west-2.ec2.archive.ubuntu.com/ubuntu/ trusty multiverse  deb http://us-west-2.ec2.archive.ubuntu.com/ubuntu/ trusty-updates multiverse  deb http://us-west-2.ec2.archive.ubuntu.com/ubuntu/ trusty-backports main restricted universe multiverse" | tee /etc/apt/sources.list.d/multiverse.list
#RUN echo ttf-mscorefonts-installer msttcorefonts/accepted-mscorefonts-eula select true |  debconf-set-selections
#RUN ["apt-get", "-y", "install", "ttf-mscorefonts-installer"]
#RUN dpkg-reconfigure  ttf-mscorefonts-installer
#RUN apt-get install -y apt-transport-https apt-utils
#RUN apt-get install  --reinstall -y ttf-mscorefonts-installer
#
#
#
##--------------
#EXPOSE 8401
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]







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
ADD ${JAR_FILE} docs-integration-ke-app-qa.jar

RUN mkdir -p /DocsUgAppKe

#run the jar file
ENTRYPOINT ["java","-jar","/docs-integration-ke-app-qa.jar"]















#Aftermath
#========================================
#Build
# docker build -t  192.180.4.122:5000/integ-ms-aarprov-edi:latest

# # Push
# docker push 192.180.4.122:5000/integ-ms-aarprov-edi:latest

# #Docker Test

# #docker run --name eurekaclient -d -p 8080:8080 192.180.4.103:5000/eurekaclient:0.1
# #docker service create --replicas 3 --name eureka-client-service -p 38080:8080 192.180.4.103:5000/eurekaclient:0.1

# #Pod / TESTING
# #kubectl apply -f docs/pod.yml

# #Deployment
# #kubectl apply -f docs/deployment.yml

# #Service
# #kubectl apply -f docs/service.yml

# Download the Microsoft core fonts rpm package.

# [root@geeksite~/]# wget https://www.itzgeek.com/msttcore-fonts-2.0-3.noarch.rpm
# Install rpm package.

# [root@geeksite~/[# rpm -Uvh msttcore-fonts-2.0-3.noarch.rpm
