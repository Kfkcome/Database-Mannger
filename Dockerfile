FROM amazoncorretto:20
MAINTAINER 1298154056@qq.com
WORKDIR /
EXPOSE 8080
ADD *.jar /app.jar
ENTRYPOINT ["java", "-jar","app.jar"]