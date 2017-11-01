FROM ubuntu-
RUN ls -l
#WORKDIR /home/lsm/ideaworkhome/
RUN pwd
ADD target/*.jar /app.jar
RUN chmod +x /app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]