FROM maven:3.3.3

WORKDIR /app
COPY pom.xml /app

COPY src /app/src
        #构建应用
RUN mvn -DskipTests=true package
        #拷贝编译结果到指定目录
RUN mv target/*.jar /app.jar
        #清理编译痕迹

VOLUME /tmp
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]