FROM maven:latest
LABEL authors="santt"

WORKDIR /app
COPY pom.xml /app/
COPY . /app/

RUN mvn package

CMD ["java", "-jar", "target/Calc.jar"]