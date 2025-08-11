# Lecture - Running First Container

This document provides a list of basic Docker CLI commands used in the lecture.

### Check Docker Version

```bash
docker --version
```

### Run a Test Container
Run a test container using the hello-world image to verify Docker installation.

```bash
docker run hello-world
```

### Pull a Docker Image
Pull the hello-world image from Docker Hub.

```bash
docker pull hello-world
```

### Check running containers
To show all currently running containers.

```bash
docker ps
```

### Check all containers
Show all containers, both running and stopped.

```bash
docker ps -a
```

### List available images
List all Docker images downloaded and available locally.

```bash
docker images
```
