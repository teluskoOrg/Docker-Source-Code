# Lecture - Running JDK Docker Container

This document provides a list of basic Docker CLI commands used in the lecture.

### JShell
- JShell is a **REPL (Read-Eval-Print Loop)** for Java introduced in Java 9.
- It allows running Java code interactively, without needing to compile and run entire class files.


### Pull OpenJDK Docker Image
**1. Search for the OpenJDK image on Docker Hub**

```bash
docker search openjdk
```

**2. Pull a specific OpenJDK Image**

```bash
docker pull openjdk:22-jdk
```

**3.Check Available Images**

```bash
docker images
```

**4. Run the OpenJDK image**

```bash
docker run openjdk:22-jdk
```

**5. Run OpenJDK image in interactive mode**

```bash
docker search openjdk
```
> The `-it` flag starts the container in **interactive terminal mode**.

**6. Check Running Containers**

```bash
docker ps
```


### Enter JShell inside the Container
```bash
jshell
int num = 8;
System.out.println("Hello World");
/exit  #to exit from JShell
```
> Make sure the openjdk image version you pull supports jshell

