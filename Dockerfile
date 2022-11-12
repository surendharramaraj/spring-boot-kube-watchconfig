FROM openjdk:11.0-jre
USER root
RUN echo "spring.application.name=springboot-docker"
ENV ACTIVEPROFILE=dev
WORKDIR /opt/springboot-docker/
COPY ./target/activeprofiledemo-0.0.1-SNAPSHOT.jar /opt/springboot-docker/
EXPOSE 8080
CMD java -jar /opt/springboot-docker/activeprofiledemo-0.0.1-SNAPSHOT.jar --spring.profiles.active=${ACTIVEPROFILE}