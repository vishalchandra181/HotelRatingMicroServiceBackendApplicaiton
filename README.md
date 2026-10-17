# 🏨 Hotel Rating Microservices Backend Application

A **microservices-based hotel rating platform** built using Spring Boot and the Spring Cloud ecosystem. The application provides a scalable backend architecture for managing users, hotels, and ratings, with service discovery, inter-service communication, centralized API routing, and security.

## 🚀 Features

- **User Service:** Manages user-related operations and authentication.
- **Hotel Service:** Handles hotel information and hotel-related operations.
- **Rating Service:** Manages ratings and reviews associated with users and hotels.
- **Service Discovery:** Uses Netflix Eureka Server for dynamic service registration and discovery.
- **API Gateway:** Provides a centralized entry point for routing client requests to backend services.
- **Inter-Service Communication:** Uses OpenFeign for declarative REST API communication between microservices.
- **Load Balancing:** Supports client-side load balancing through Spring Cloud LoadBalancer and service discovery.
- **Data Persistence:** Uses Spring Data JPA for database interactions.
- **Security:** Integrates Spring Security for securing application endpoints.
- **RESTful APIs:** Exposes REST endpoints for communication between services and clients.

## 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| Java | Backend development |
| Spring Boot | Microservice development |
| Spring Cloud | Distributed system integration |
| Spring Data JPA | Database access and persistence |
| Spring Security | Application security |
| Netflix Eureka | Service registration and discovery |
| Spring Cloud Gateway | API routing and gateway management |
| OpenFeign | Inter-service REST communication |
| REST APIs | Service-to-service and client communication |
| Maven | Dependency management and build automation |

## 🏗️ Architecture

The application follows a distributed microservices architecture in which each service is responsible for a specific business domain.

```text
                 Client Application
                         |
                         v
                  +--------------+
                  |  API Gateway |
                  +--------------+
                         |
             +-----------+-----------+
             |           |           |
             v           v           v
       +-----------+ +-----------+ +-----------+
       |   User    | |   Hotel   | |  Rating   |
       |  Service  | |  Service  | |  Service  |
       +-----------+ +-----------+ +-----------+
             |           |           |
             +-----------+-----------+
                         |
                         v
                +------------------+
                |  Eureka Server   |
                | Service Discovery|
                +------------------+
```

*Note: Eureka provides service registration and discovery. The gateway and services use the registered service information to route requests and communicate with one another.*

## 📂 Project Components

### 1. User Service
- Manages user-related information.
- Provides REST APIs for user operations.
- Integrates with the hotel and rating services where required.

### 2. Hotel Service
- Manages hotel details and information.
- Exposes REST endpoints for retrieving hotel data.
- Provides hotel information required by the rating service and other consumers.

### 3. Rating Service
- Creates and retrieves hotel ratings.
- Connects rating data with relevant user and hotel information.
- Uses OpenFeign for communication with other microservices, where configured.

### 4. Eureka Server
- Registers available microservices.
- Enables dynamic service discovery.
- Helps services locate one another without hardcoding individual service addresses.

### 5. API Gateway
- Acts as the centralized entry point for incoming API requests.
- Routes requests to the appropriate backend service.
- Supports a centralized location for gateway-level routing and related policies.

## ⚙️ Getting Started

### Prerequisites

Install the following tools before running the application:

- Java JDK (compatible with your project configuration)
- Maven
- Git
- A supported relational database, if configured by the application

### Clone the Repository

```bash
git clone <YOUR_GITHUB_REPOSITORY_URL>
cd <YOUR_PROJECT_DIRECTORY>
```

### Build the Application

If the repository contains a root-level Maven project:

```bash
mvn clean install
```

Otherwise, build each microservice from its respective directory:

```bash
mvn clean package
```

### Run the Services

Start the services in the order required by your configuration:

1. Eureka Server
2. User Service
3. Hotel Service
4. Rating Service
5. API Gateway

Run each Spring Boot application using Maven:

```bash
mvn spring-boot:run
```

Run the command from the relevant service directory. Ensure that each service has the correct port, database settings, Eureka configuration, and gateway routes configured in its application properties or YAML files.

## 🔌 API Endpoints

The following are illustrative endpoint patterns. Update them to match the actual controller mappings in your project.

| Service | Example Endpoint | Purpose |
|---|---|---|
| User Service | `/users` | User-related operations |
| Hotel Service | `/hotels` | Hotel-related operations |
| Rating Service | `/ratings` | Rating-related operations |
| API Gateway | Configured gateway routes | Routes requests to backend services |

## 🔐 Configuration

Before running the application, configure the following in the appropriate `application.properties` or `application.yml` files:

- Server ports for each service.
- Database connection URLs and credentials.
- Eureka server URL.
- API Gateway route definitions.
- Spring Security authentication and authorization settings.

**Security recommendation:** Store sensitive credentials in environment variables or a secrets manager rather than committing them to GitHub.

## 🎯 Learning Outcomes

This project demonstrates practical experience with:

- Designing and implementing Spring Boot microservices.
- Building RESTful APIs and managing business logic.
- Implementing service discovery with Eureka.
- Configuring API Gateway routing.
- Enabling inter-service communication with OpenFeign.
- Integrating Spring Data JPA for persistence.
- Applying Spring Security to backend applications.
- Understanding distributed application architecture and service-to-service dependencies.

## 🔮 Future Enhancements

- Add Docker support for containerized deployments.
- Introduce Docker Compose for local multi-service orchestration.
- Implement centralized logging and distributed tracing.
- Add automated unit and integration tests.
- Integrate a CI/CD pipeline.
- Add API documentation using Swagger / OpenAPI.
- Enhance authentication and authorization with JWT, if not already implemented.

## 👨‍💻 Author

**Vishal Chandra**

GitHub: [Your GitHub Profile](https://github.com/)

---

⭐ If you find this project useful, consider giving the repository a star.
