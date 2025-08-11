# Lecture - Docker Commands

This document provides a list of basic Docker CLI commands used in the lecture.

### Common Docker Commands

| Command             | Description                                       |
|---------------------|---------------------------------------------------|
| `docker run`        | Create and run a new container from an image     |
| `docker exec`       | Execute a command in a running container         |
| `docker ps`         | List running containers                          |
| `docker ps -a`      | List all containers (running and stopped)        |
| `docker build`      | Build an image from a Dockerfile                 |
| `docker bake`       | Build from a file                                |
| `docker pull`       | Download an image from a registry                |
| `docker push`       | Upload an image to a registry                    |
| `docker images`     | List all downloaded Docker images                |
| `docker login`      | Authenticate to a Docker registry                |
| `docker logout`     | Logout from a Docker registry                    |
| `docker search`     | Search Docker Hub for images                     |
| `docker version`    | Show Docker version info                         |
| `docker info`       | Display system-wide Docker info                  |


### Container & Image Lifecycle Commands

**List All Containers**

```bash
docker ps -a
```

**Delete a container**

```bash
docker rm <container_id>
```

**List All Images**

```bash
docker images
```
**Delete an image**

```bash
docker rmi <image_id>
```


### Key Note:

- Every time you run a Docker container, a **new container ID** is generated.
- A container must be **removed first** before its corresponding image can be deleted.


### Step-by-Step: Docker Workflow
**1. Search for Images on Docker Hub**

```bash
docker search <image_name>
```

**2. Pull an image from Docker Hub**

```bash
docker pull <image_name>
```

**3. Check Containers (None Created Yet)**

```bash
docker ps -a
```

**4. Create a Container from the Image**

```bash
docker create <image_name>
```

**5. Verify Container is Created**

```bash
docker ps -a
```

**6. Start the Container**

```bash
docker start <container_id>
```
> Either the `container_id` or the `container_name` can be used.

**7. Confirm Container is Running**

```bash
docker ps -a
```

**8. Pause the Container (Optional)**

```bash
docker pause <container_id>
```

**9. Stop the container**

```bash
docker stop <container_id>
```

**10. Remove the container**

```bash
docker rm <container_id>
```

**11. Verify Container is Removed**
```bash
docker ps -a 
```





