FROM openjdk:19

WORKDIR /app

COPY . /app

EXPOSE 8080

CMD ["java", "-jar","swine-search-project.jar"]