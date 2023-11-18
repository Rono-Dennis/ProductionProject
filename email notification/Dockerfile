FROM openjdk:17

# Make port 8181 available to the world outside this container
EXPOSE 8181

#The fLat File
ARG JAR_FILE=target/exceptionals-alerts.jar

#Add applications'jar to the container
ADD ${JAR_FILE} exceptionals-alerts.jar

RUN mkdir -p /exceptionals-alerts

#run the jar file
ENTRYPOINT ["java","-jar","/exceptionals-alerts.jar"]










##Use spark core
#FROM 192.180.4.106:5000/sparkcore:1.0
#
#RUN apk add --no-cache tzdata
#ENV TZ Africa/Nairobi
#
## Add Maintainer info
##LABEL maintainer="kenan.muga@smartapplicationsgroup.com"
#
## Add a volume pointing to /tmp
#VOLUME /tmp
#
## Make port 8761 available to the world outside this container
#EXPOSE 8080
#
## The fat jar
#ARG JAR_FILE=target/*.jar
##ARG JAR_FILE=target/alerts-engine-8.4.jar
#
## Add the application's jar to the container
#ADD ${JAR_FILE} alerts-engine.jar
#
## Run the jar file
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/alerts-engine.jar"]


#Aftermath
#========================================
#Build
#docker build -t 192.180.4.106:5000/alertsengine:8.4 .

#Push
#docker push 192.180.4.106:5000/alertsengine:8.4

#Docker Test

#docker run --name alertsengine -d -p 38080:8080 192.180.4.103:5000/alertsengine:0.4
#docker service create --replicas 3 --name alert-engine-service -p 38080:8080 192.180.4.103:5000/alertsengine:0.4

#Pod / TESTING
#kubectl apply -f docs/pod.yml

#Deployment
#kubectl apply -f docs/deployment.yml

#Service
#kubectl apply -f docs/service.yml
