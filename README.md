 1. 运行mongodb docker
 
```java
docker run -P -d --name mongodb mongo
```

2. 构建项目

> 生成的jar包在build/libs下

3. 构建image

```java
docker build -t microservicedemo/employee .
```

4. 创建连接到mongodb的容器

```java
docker run -P -d --name employee --link mongodb microservicedemo/employee
```
 