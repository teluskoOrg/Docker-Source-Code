# Lecture - Running Multiple Containers

This document provides a list of basic Docker CLI commands used in the lecture.

### Stop and Remove All Running Containers
```bash
docker-compose down
```


### Clean and Package the Spring Boot App
```bash
mvn clean package -DskipTests
```


### Build and Start Containers
```bash
docker-compose up --build
```


### Check Running Containers
```bash
docker ps
```


### View Docker Networks
To list all Docker networks on your system:
```bash
docker network ls
```

