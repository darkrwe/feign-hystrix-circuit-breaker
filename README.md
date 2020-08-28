# Feign Client Hystrix Circuit-Breaker

Feign-Hystrix Circuit-Breaker Client Application

Spring Boot + Spring Data JPA + Spring Cloud Feign Client + Netflix Hystrix

## Profiles
* dev

## Prepare DB
```
docker pull mysql
docker run --name=mysql -d -p 3306:3306 -e "MYSQL_ROOT_PASSWORD=root" -e "MYSQL_DATABASE=main" -e "MYSQL_USER=test" -e "MYSQL_PASSWORD=test" mysql:latest
```

## Build
```
mvn clean install
```

## Usage
```
java -jar feign-hystrix-circuit-breaker.jar
```

## Authors - Version 4.0
* Emin İnal
