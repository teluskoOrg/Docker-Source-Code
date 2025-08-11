# Lecture - Docker Compose

This document provides a list of basic Docker CLI commands used in the lecture.

### Clean and Package the Application
Use Maven to clean and create a JAR package of the Spring Boot project:
```bash
mvn clean package
```


### Build and Start Docker Containers
Use Docker Compose to build the images and start the containers:
```bash
docker-compose up --build
```
> This will use the docker-compose.yml file to build the application.


### List Docker Images
```bash
docker images
```
