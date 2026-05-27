# Post Assessment Spring Boot Demo

This is a simple Spring Boot project created for grading/demo purposes. It contains small examples for multiple post-assessment coding questions in one project.

The focus is on beginner-friendly code, simple layered architecture, and readable examples rather than production-ready implementation.

## Tech Stack

- Java 21
- Spring Boot
- Maven
- Spring Web
- Spring Data JPA
- Validation
- MySQL Driver
- Spring Security
- Eureka Discovery Client
- Spring Cloud Gateway
- Resilience4j
- JUnit 5 and Mockito
- Docker

## Project Structure

```text
src/main/java/com/post/test
├── config
├── controller
├── dto
├── entity
├── repository
└── service
```

## Questions Covered

- Q3: Student DTO validation and POST API
- Q5: Employee and Department JPA relationship
- Q7: Product repository custom JPQL query
- Q9: Second highest salary using SQL idea and JPQL query
- Q10: Spring Data JPA derived query methods
- Q12: Eureka client configuration
- Q13: Resilience4j Circuit Breaker with RestTemplate fallback
- Q14: Spring Cloud Gateway route configuration
- Q15: Load-balanced RestTemplate bean
- Q17: ProductService unit test using JUnit 5 and Mockito
- Q19: Dockerfile for Spring Boot app
- Q20: docker-compose file with database and app service
- Q21: Simple HTML and JavaScript fetch example

## Database Configuration

The project uses this MySQL configuration in `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/CRT
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## Run Tests

```bash
./mvnw test
```

## Build JAR

```bash
./mvnw clean package
```

## Docker Commands

Build image:

```bash
docker build -t myapp:latest .
```

Run container:

```bash
docker run -p 8080:8080 myapp:latest
```

Run with docker compose:

```bash
docker compose up
```

## Notes

This project intentionally keeps the implementation minimal. Some configurations are included together in one project only to demonstrate the assessment concepts clearly.
