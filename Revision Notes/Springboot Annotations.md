# J2EE Annotations in Spring Boot Application

## Table Structure:

| Annotation                         | Description                                                                                                                                                                | Example Use Case                                                                                                                                                                             |
|-----------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `@SpringBootApplication`         | Indicates that a class is a Spring Boot application. It combines three annotations: `@Configuration`, `@EnableAutoConfiguration`, and `@ComponentScan`.                 | Main class declaration: `@SpringBootApplication`                                                                                                                                             |
| `@RestController`                 | Marks a class as a controller where methods return domain objects instead of view names.                                                                                   | RESTful controller declaration: `@RestController`                                                                                                                                            |
| `@RequestMapping`                 | Maps HTTP requests to handler methods of MVC and REST controllers.                                                                                                         | Mapping a request to a controller method: `@RequestMapping("/users")`                                                                                                                       |
| `@Autowired`                       | Injects dependencies automatically by type. It is used for wiring beans in the Spring container.                                                                           | Dependency injection in a service: `@Autowired private UserService userService;`                                                                                                              |
| `@Component`                       | Indicates that a class is a Spring component, allowing it to be automatically detected and registered as a bean in the Spring application context.                        | Creating a custom component: `@Component`                                                                                                                                                    |
| `@Repository`                      | Indicates that a class is a Spring Data repository, typically for database access.                                                                                         | Declaring a repository interface: `@Repository`                                                                                                                                             |
| `@Service`                         | Indicates that a class is a service component in the business layer.                                                                                                       | Marking a service class: `@Service`                                                                                                                                                          |
| `@RestControllerAdvice`           | Globalizes exception handling in RESTful web services.                                                                                                                      | Handling exceptions globally: `@RestControllerAdvice`                                                                                                                                        |
| `@GetMapping`, `@PostMapping`, etc.| Shortcut annotations for specifying HTTP request methods in controller mappings.                                                                                            | Handling HTTP GET requests: `@GetMapping("/users")`                                                                                                                                         |
| `@RequestParam`                   | Binds the value of a request parameter to a method parameter in a controller.                                                                                              | Getting request parameters: `@RequestParam("id") Long userId`                                                                                                                               |
| `@PathVariable`                   | Extracts values from the URI path and binds them to method parameters.                                                                                                      | Using path variables in a request mapping: `@RequestMapping("/users/{id}")`                                                                                                                  |
| `@Valid`                           | Indicates that an object should be validated. Typically used in conjunction with validation annotations like `@NotNull`, `@Size`, etc.                                      | Validating input data in controller methods: `public ResponseEntity<User> createUser(@Valid @RequestBody User user)`                                                                         |
| `@Transactional`                   | Declares a method as transactional, meaning that it will be executed within a transaction.                                                                                  | Managing database transactions: `@Transactional`                                                                                                                                            |
| `@Scheduled`                       | Defines a method to be scheduled for execution at a fixed rate or delay.                                                                                                    | Scheduling a method for periodic execution: `@Scheduled(fixedRate = 5000)`                                                                                                                   |
| `@Value`                           | Injects values from properties files or environment variables into Spring beans.                                                                                            | Injecting property values: `@Value("${app.url}") private String apiUrl;`                                                                                                                     |
| `@EnableJpaRepositories`          | Enables JPA repositories in the Spring application context.                                                                                                                 | Enabling JPA repositories: `@EnableJpaRepositories(basePackages = "com.example.repositories")`                                                                                             |
| `@EnableSwagger2`                  | Enables Swagger for documenting and testing RESTful APIs.                                                                                                                   | Enabling Swagger in a Spring Boot application: `@EnableSwagger2`                                                                                                                              |
| `@EnableAsync`                     | Enables asynchronous method execution in Spring.                                                                                                                             | Enabling asynchronous processing: `@EnableAsync`                                                                                                                                            |
| `@EnableScheduling`                | Enables Spring's scheduled task execution capability.                                                                                                                        | Enabling scheduling: `@EnableScheduling`                                                                                                                                                   |
| `@Profile`                         | Indicates which beans should be loaded based on the active profiles.                                                                                                        | Selective bean loading based on profile: `@Profile("dev")`                                                                                                                                   |

## Theoretical Structure:

1. **@SpringBootApplication:**
   - Combines `@Configuration`, `@EnableAutoConfiguration`, and `@ComponentScan`.
   - Declares the main class of a Spring Boot application.

2. **@RestController:**
   - Marks a class as a controller for RESTful services.
   - Automatically serializes return objects into JSON or XML.

3. **@RequestMapping:**
   - Maps HTTP requests to handler methods in controllers.
   - Defines the URL pattern for accessing the mapped method.

4. **@Autowired:**
   - Injects dependencies automatically by type.
   - Simplifies the process of wiring beans in the Spring container.

5. **@Component, @Repository, @Service:**
   - Marks classes as Spring components for automatic bean detection and registration.

6. **Exception Handling Annotations:**
   - `@RestControllerAdvice`: Globalizes exception handling in RESTful services.
   - `@ExceptionHandler`: Handles exceptions in a specific controller.

7. **HTTP Method Annotations:**
   - `@GetMapping`, `@PostMapping`, etc.: Shortcut annotations for specifying HTTP request methods.

8. **Parameter Binding Annotations:**
   - `@RequestParam`: Binds request parameters to method parameters.
   - `@PathVariable`: Extracts values from the URI path.

9. **Validation Annotations:**
   - `@Valid`: Indicates that an object should be validated.
   - Used in conjunction with validation annotations like `@NotNull`, `@Size`, etc.

10. **Transactional Annotations:**
   - `@Transactional`: Declares a method as transactional.

11. **Scheduling and Asynchronous Annotations:**
   - `@Scheduled`: Schedules a method for periodic execution.
   - `@EnableAsync`: Enables asynchronous method execution.
   - `@EnableScheduling`: Enables Spring's scheduled task execution capability.

12. **Property and Profile Annotations:**
   - `@Value`: Injects values from properties files or environment variables.
   - `@Profile`: Loads beans based on the active profiles.

13. **Other Annotations:**
   - `@EnableJpaRepositories`: Enables JPA repositories in the application context.
   - `@EnableSwagger2`: Enables Swagger for documenting and testing RESTful APIs.



## More Annotations and Their Explanations :

### J2EE Annotations in Spring Boot Application

#### Table Structure:

| Annotation                         | Description                                                                                                                                                                | Example Use Case                                                                                                                                                                             |
|-----------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `@Configuration`                  | Indicates that a class declares one or more bean definitions and runtime configuration for the application context.                                                        | Defining a configuration class: `@Configuration`                                                                                                                                            |
| `@EnableAutoConfiguration`        | Automatically configures Spring context based on jars in the classpath.                                                                                                     | Enabling auto-configuration: `@EnableAutoConfiguration`                                                                                                                                     |
| `@ComponentScan`                  | Configures component scanning directives for use with `@Configuration` classes.                                                                                              | Scanning for components: `@ComponentScan(basePackages = "com.example")`                                                                                                                    |
| `@Entity`                         | Marks a class as an entity for use with JPA.                                                                                                                                | Defining an entity class: `@Entity`                                                                                                                                                         |
| `@Table`                          | Specifies the details of the table that corresponds to an entity class.                                                                                                     | Mapping an entity to a specific database table: `@Table(name = "users")`                                                                                                                    |
| `@Column`                         | Maps a class field to a column in a database table.                                                                                                                         | Mapping an entity attribute to a specific database column: `@Column(name = "user_name")`                                                                                                    |
| `@Transactional`                  | Defines the scope of a single database transaction.                                                                                                                         | Managing database transactions: `@Transactional`                                                                                                                                            |
| `@Cacheable`, `@CacheEvict`, etc. | Annotations for caching method results.                                                                                                                                     | Caching method results: `@Cacheable("users")`                                                                                                                                              |
| `@RequestMapping`, `@GetMapping`, etc.| Annotations for handling HTTP requests.                                                                                                                                    | Handling HTTP requests: `@GetMapping("/users/{id}")`                                                                                                                                        |
| `@RequestBody`                    | Binds the HTTP request body to a method parameter.                                                                                                                         | Handling HTTP POST requests: `public ResponseEntity<User> createUser(@RequestBody User user)`                                                                                               |
| `@ResponseBody`                   | Binds the return value of a method to the HTTP response body.                                                                                                               | Returning JSON/XML responses: `@ResponseBody ResponseEntity<User> getUser(@PathVariable("id") Long id)`                                                                                   |
| `@PathVariable`                   | Extracts values from the URI path and binds them to method parameters.                                                                                                      | Using path variables in a request mapping: `@RequestMapping("/users/{id}")`                                                                                                                  |
| `@RequestParam`                   | Binds the value of a request parameter to a method parameter.                                                                                                               | Getting request parameters: `@RequestParam("id") Long userId`                                                                                                                               |
| `@ResponseStatus`                 | Sets the HTTP status code for the response.                                                                                                                                | Customizing HTTP response status: `@ResponseStatus(HttpStatus.CREATED)`                                                                                                                     |
| `@ExceptionHandler`               | Handles exceptions thrown by request handler methods.                                                                                                                       | Custom exception handling: `@ExceptionHandler(value = { IllegalArgumentException.class })`                                                                                                   |
| `@CrossOrigin`                    | Configures cross-origin resource sharing (CORS) for web services.                                                                                                           | Allowing cross-origin requests: `@CrossOrigin(origins = "http://localhost:8080")`                                                                                                           |
| `@Async`                          | Marks a method as asynchronous, allowing it to be executed in a separate thread.                                                                                             | Performing asynchronous operations: `@Async`                                                                                                                                               |
| `@Profile`                        | Indicates which beans should be loaded based on the active profiles.                                                                                                        | Selective bean loading based on profile: `@Profile("dev")`                                                                                                                                   |
| `@Primary`                        | Marks a bean as primary when multiple beans of the same type exist.                                                                                                          | Defining a primary bean: `@Primary`                                                                                                                                                        |
| `@Lazy`                           | Indicates that a bean should be lazily initialized.                                                                                                                         | Lazily initializing a bean: `@Lazy`                                                                                                                                                        |
| `@Scheduled`                      | Defines a method to be scheduled for execution at a fixed rate or delay.                                                                                                    | Scheduling a method for periodic execution: `@Scheduled(fixedRate = 5000)`                                                                                                                   |
| `@Value`                          | Injects values from properties files or environment variables into Spring beans.                                                                                             | Injecting property values: `@Value("${app.url}") private String apiUrl;`                                                                                                                     |
| `@Qualifier`                      | Specifies which bean should be injected when multiple beans of the same type exist.                                                                                          | Qualifying autowired beans: `@Autowired @Qualifier("myDataSource") private DataSource dataSource;`                                                                                          |
| `@Conditional`                    | Enables conditional bean registration based on a condition evaluation.                                                                                                      | Conditional bean registration: `@Conditional(MyCondition.class)`                                                                                                                            |
| `@EventListener`                  | Marks a method as an event listener within a Spring application context.                                                                                                     | Handling application events: `@EventListener(ApplicationStartedEvent.class)`                                                                                                                 |

#### Theoretical Structure:

1. **Configuration Annotations:**
   - `@Configuration`: Declares one or more bean definitions and runtime configurations.
   - `@EnableAutoConfiguration`: Automatically configures the Spring context based on classpath dependencies.
   - `@ComponentScan`: Configures component scanning directives.

2. **JPA Annotations:**
   - `@Entity`: Marks a class as an entity for use with JPA.
   - `@Table`: Specifies the details of the table corresponding to an entity class.
   - `@Column`: Maps a class field to a column in a database table.

3. **Transactional and Caching Annotations:**
   - `@Transactional`: Defines the scope of a single database transaction.
   - `@Cacheable`, `@CacheEvict`: Annotations for caching method results.

4. **Request Mapping Annotations:**
   - `@RequestMapping`, `@GetMapping`, etc.: Annotations for handling HTTP requests.
   - `@RequestBody`, `@ResponseBody`: Binding HTTP request and response bodies.

5. **Exception Handling Annotations:**
   - `@ExceptionHandler`: Handles exceptions thrown by request handler methods.
   - `@ResponseStatus`: Sets the HTTP status code for the response.

6. **Cross-Origin Resource Sharing (CORS) Annotations:**
   - `@CrossOrigin`: Configures cross-origin resource sharing for web services.

7. **Asynchronous and Scheduling Annotations:**
   - `@Async`: Marks a method as asynchronous.
   - `@Scheduled`: Schedules a method for periodic execution.

8. **Environment and Profile Annotations:**
   - `@Value`: Injects values from properties files or environment variables.
   - `@Profile`: Loads beans based on active profiles.

9. **Other Common Annotations:**
   - `@Qualifier`: Specifies which bean should be injected when multiple beans of the same type exist.
   - `@Lazy`: Indicates that a bean should be lazily initialized.
   - `@Primary`: Marks a bean as primary when multiple beans of the same type exist.
   - `@Conditional`: Enables conditional bean registration based on a condition evaluation.
   - `@EventListener`: Marks a method as an event listener within a Spring application context.
