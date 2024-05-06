# Setting up a Discovery Server with Eureka in Spring Boot

---

## Introduction

In a microservices architecture, a Discovery Server plays a crucial role in service discovery, registration, and management. This guide will walk you through the process of setting up a Discovery Server using Eureka with Spring Boot.

---

## Stepwise Guide

### 1. What is a Discovery Server?

- A Discovery Server facilitates automatic service registration and discovery in a microservices architecture.
- It enables services to dynamically discover and communicate with each other without hardcoded dependencies.

### 2. Why Use a Discovery Server?

- Simplifies microservices architecture by enabling automatic service registration and discovery.
- Provides high availability and fault tolerance by dynamically managing service instances.
- Facilitates scaling and load balancing by distributing incoming requests among multiple service instances.

### 3. Setup a Spring Boot Project

- Create a new Spring Boot project using Spring Initializr or your preferred IDE.

### 4. Add Eureka Server Dependency

- Add the Eureka Server dependency to your `pom.xml`:

  ```xml
  <dependency>
      <groupId>org.springframework.cloud</groupId>
      <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
  </dependency>
  ```
### 5. Enable Eureka Server

- Annotate your main class with @EnableEurekaServer to enable Eureka Server functionality:
  ```java
    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;
    import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

    @SpringBootApplication
    @EnableEurekaServer
    public class DiscoveryServerApplication {

        public static void main(String[] args) {
            SpringApplication.run(DiscoveryServerApplication.class, args);
        }
    }
    ```
### 6. Configure Eureka Server Properties

- Add the following configuration to your `application.properties` file:
  
  ```properties
    spring.application.name=discovery-server
    server.port=8761
    eureka.client.register-with-eureka=false
    eureka.client.fetch-registry=false
    ```
### 7. Start the Discovery Server

- Run your Spring Boot application. Eureka Server will start on port 8761 by default.
  
### 8. Access Eureka Server Dashboard

- Open a web browser and navigate to `http://localhost:8761.` You should see the Eureka Server dashboard showing registered service instances.
  
### 9. Connect Microservices to Eureka Server

- In your microservices, add the Eureka Client dependency and configure them to register with the Eureka Server.
- Annotate your main class with `@EnableEurekaClient`.
- Add the Eureka Server URL to the `application.properties` file of each microservice:
  ```properties
  eureka.client.service-url.default-zone=http://localhost:8761/eureka/
  ```

### 10. How Discovery Server Helps in Scaling and Load Balancing

- **Service Registration:** Microservices register themselves with the Discovery Server upon startup.
- **Service Discovery:** Clients dynamically discover service instances from the Discovery Server without hardcoded URLs.
- **Load Balancing:** Discovery Server routes incoming requests to available service instances, distributing the load evenly.
- **Scaling:** New service instances can be added or removed dynamically, allowing for horizontal scaling based on demand.
  
# Conclusion: 

    Setting up a Discovery Server using Eureka with Spring Boot enables seamless service registration, discovery, scaling, and load balancing in a microservices architecture. By following the above steps, you can easily integrate Eureka Server into your Spring Boot applications.


 