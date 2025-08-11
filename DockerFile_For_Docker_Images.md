# Lecture - Running First Container

This document provides a list of basic Docker CLI commands used in the lecture.

### Build the Docker Image

Navigate to the directory that contains your `Dockerfile` and run:

```bash
docker build -t telusko/rest-demo:v3 .
```
> This builds a Docker image named telusko/rest-demo with tag v3 using the current directory (.) as the build context.


### List Available Docker Images
```bash
docker images
```


### Run the Docker Image with Port Mapping
```bash
docker run -p 8081:8081 telusko/rest-demo:v3
```
> This runs the container from the newly built image and maps port 8081 of the host to port 8081 of the container.
