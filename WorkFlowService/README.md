# WorkFlowService

WorkFlowService is a Spring Boot-based microservice designed to manage workflows using the Camunda BPM engine. It includes JWT-based authentication and authorization to secure endpoints and provide role-based access control. The service is capable of processing requests based on user roles defined in the JWT token.

## Features

- Spring Boot RESTful API
- Camunda BPM integration for workflow management
- JWT-based authentication and authorization
- Role-based access control
- H2 in-memory database for development and testing
- JAXB support for XML binding
- Camunda web interface for process monitoring

## Tools and Technologies Used
- **Java 21**
- **Spring Boot 3.5.3**
    - `spring-boot-starter-web`
    - `spring-boot-starter-security`
    - `spring-boot-starter-test`
- **Camunda BPM 7.20.0**
    - `camunda-bpm-spring-boot-starter-webapp`
- **JWT**
    - `io.jsonwebtoken:jjwt:0.9.1`
- **JAXB**
    - `javax.xml.bind:jaxb-api:2.3.1`
    - `org.glassfish.jaxb:jaxb-runtime:2.3.1`
- **H2 Database**
    - `com.h2database:h2`
- **Maven** for build and dependency management

## Getting Started

### Prerequisites
- Java 21
- Maven 3.8+

### Build and Run

```bash
# Clone the repository
git clone 
cd WorkFlowService
# Build the project
mvn clean install

# Run the application
mvn spring-boot:run
