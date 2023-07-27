
#VOLUME /tmp
#ADD docker-test-*.jar docker-test.jar
#ENV TZ=Asia/Shanghai
#WORKDIR /app
#COPY docker-test.jar docker-test.jar
#EXPOSE 8080
#CMD ["java", "-jar", "docker-test.jar"]



# 使用一个基础的Maven镜像作为构建镜像
#FROM maven:3.8.3-openjdk-8 AS build
#
## 设置工作目录为 /app
#WORKDIR /app
#
## 复制项目的pom.xml到容器中
#COPY pom.xml .
#
## 下载并安装依赖
#RUN mvn dependency:go-offline
#
## 复制整个项目到容器中
#COPY . .
#
## 执行Maven构建
#RUN mvn package
#
## 使用一个基础的Java镜像作为运行时镜像
#FROM openjdk:8-jre-slim
#
## 设置工作目录为 /app
#WORKDIR /app
#
## 从构建镜像中复制构建好的JAR文件到运行时镜像
#COPY --from=build /app/target/your-project-name-version.jar app.jar
#
## 定义应用程序的启动命令
#CMD ["java", "-jar", "app.jar"]
