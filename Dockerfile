FROM maven:3.3.3

RUN rm -rf /tmp/build
RUN mkdir /tmp/build
ADD pom.xml /tmp/build/
RUN cd /tmp/build

ADD src /tmp/build/src
        #构建应用
RUN cd /tmp/build
RUN mvn -q -DskipTests=true package
        #拷贝编译结果到指定目录
RUN mv target/*.jar /app.jar
        #清理编译痕迹
RUN cd /
RUN rm -rf /tmp/build

VOLUME /tmp
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
