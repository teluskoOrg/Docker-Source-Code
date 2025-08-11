# Lecture - Running SpringBoot App on Docker

This document provides a list of basic Docker CLI commands used in the lecture.

### Check Running Containers

```bash
docker ps
```

### List All Files in the Container (JDK Environment)

```bash
docker exec <container_name> ls -a
```
> Lists all folders and files in the container's root directory.

### Check Contents of /tmp Directory

```bash
docker exec <container_name> ls /tmp
```
> It will contain only one file in /tmp at the initial stage.


###  Copy the Spring Boot JAR File into the Container

```bash
docker cp target/rest-demo.jar <container_name>:/tmp
```
> This copies the `rest-demo.jar` into the container’s /tmp directory.


### Verify the JAR File is Present

```bash
docker exec <container_name> ls /tmp
```
> The `rest-demo.jar` file will be available in addition to the existing content.


###  Commit the Container to Create a New Docker Image

```bash
docker commit <container_name> telusko/rest-demo:v1
```
> Creates a new Docker image named `telusko/rest-demo` with tag `v1` from the current container state.


### List Docker Images

```bash
docker images
```
> Verifies that `telusko/rest-demo:v1` image has been created successfully.


### Default Behavior: JShell

When running telusko/rest-demo:v1, the container defaults to JShell:

```bash
docker run telusko/rest-demo:v1
```


### Set Default Command to Run JAR Using --change

To override the default JShell behavior, the `--change` flag is used while committing:

```bash
docker commit --change='CMD ["java", "-jar", "/tmp/rest-demo.jar"]' <container_name> telusko/rest-demo:v2
```
> This sets the default command to run the JAR directly when the image is run.


### Run the Updated Image (v2)

```bash
docker run telusko/rest-demo:v2
```
> This will now run the Spring Boot application from the JAR instead of entering JShell.


### Map Ports While Running the Container

```bash
docker run -p 8081:8081 telusko/rest-demo:v2
```
> Maps port `8081` of the container to `8081` on the host machine.


