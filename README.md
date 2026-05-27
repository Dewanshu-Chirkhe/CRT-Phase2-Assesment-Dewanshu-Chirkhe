# CRT Phase 2 Post Assessment Demo

This is a single Spring Boot project created for grading/demo purposes. It demonstrates the coding questions from the CRT Phase 2 post-assessment in one simple project.

The code is intentionally simple, beginner-friendly, and short. It is not meant to be production-ready.

## Tech Stack

- Java 21
- Spring Boot
- Maven
- MySQL
- Spring Web
- Spring Data JPA
- Validation
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

## Coding Questions Covered

| Question | Requirement | Implementation |
| --- | --- | --- |
| Q3 | POST `/api/students` with validation | `StudentDTO`, `StudentController` |
| Q5 | `Employee` and `Department` JPA relationship | `Employee`, `Department` |
| Q7 | Spring Data JPA `@Query` repository method | `ProductRepository` |
| Q9 | SQL query for second highest salary and JPQL version | `EmployeeRepository` |
| Q10 | Four derived query method signatures | `StudentRepository` |
| Q12 | Eureka `application.yml` and main class annotation | `application.yml`, `TestApplication` |
| Q13 | `@CircuitBreaker` with `RestTemplate` and fallback | `PaymentService`, `PaymentResponse` |
| Q14 | Spring Cloud Gateway routes | `application.yml` |
| Q15 | `RestTemplate` bean with service discovery | `AppConfig` |
| Q17 | JUnit 5 and Mockito unit test | `ProductServiceTest` |
| Q19 | Dockerfile and Docker build/run commands | `Dockerfile` |
| Q20 | Docker Compose file | `docker-compose.yml` |
| Q21 | JavaScript `loadUsers()` async function | `src/main/resources/static/users.html` |

## [Theory / Conceptual Questions](</home/dewanshu-chirkhe/Documents/CRT/test/CRT-Phase2-Assesment-[Dewanshu-Chirkhe].pdf>)

## Database Configuration

The project uses this MySQL configuration in `application.properties`:

```properties
spring.application.name=task2
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

Run with Docker Compose:

```bash
docker compose up
```

## Notes

This project keeps all examples inside one Spring Boot project even though some topics, such as Gateway and normal REST controllers, are often separated in real microservice projects.
