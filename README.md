## 1. 运行mongodb docker
 
```java
docker run -P -d --name mongodb mongo
```

## 2. 构建项目

> 生成的jar包在build/libs下

## 3. 构建image

```java
docker build -t microservicedemo/employee .
```

## 4. 创建连接到mongodb的容器

```java
docker run -P -d --name employee --link mongodb microservicedemo/employee
```
 
## 5. 验证

post  /employee

 ```json

{
  "id": "55fb2f1930e07c6c844b02ff",
  "email": "haoqiang@oneapm.com",
  "fullName": "haoqiang",
  "managerEmail": null
}

```
 get  /employee/55fb2f1930e07c6c844b02ff
```json
{
  "id": "55fb2f1930e07c6c844b02ff",
  "email": "haoqiang@oneapm.com",
  "fullName": "haoqiang",
  "managerEmail": null
}
```