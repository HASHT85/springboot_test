# Spring Boot Test Project

This project demonstrates a basic Spring Boot application with JPA, security, Lombok and OpenAPI documentation. It exposes a simple REST API to manage students.

## Prerequisites

- **Java 21** must be installed.
- Maven is provided through the Maven Wrapper (`mvnw`), so you do not need a separate Maven installation.

## Build

Run the following command to compile the project and package the application:

```bash
./mvnw clean package
```

## Run

Start the application using the Spring Boot Maven plugin:

```bash
./mvnw spring-boot:run
```

The application listens on port **9000**. After startup you can access:

- **Swagger UI**: [http://localhost:9000/swagger-ui/index.html](http://localhost:9000/swagger-ui/index.html)
- **H2 Console**: [http://localhost:9000/h2-console](http://localhost:9000/h2-console)

