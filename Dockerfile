FROM openjdk:8

COPY edp-service-0.1.0.jar /usr/src/edp-service-0.1.0.jar

CMD java -jar /usr/src/edp-service-0.1.0.jar