# Hibernate and JPA Concepts

## Table Structure

| Concept                 | Description                                                                           |
|-------------------------|---------------------------------------------------------------------------------------|
| **Hibernate**           |                                                                                       |
| Entity                  | Represents a table in the database.                                                   |
| `@Entity`               | Annotation used to mark a Java class as an entity.                                    |
| `@Table`                | Annotation used to specify the table name for an entity.                             |
| `@Id`                   | Annotation used to define the primary key of an entity.                               |
| `@GeneratedValue`      | Annotation used to generate primary key values automatically.                         |
| Relationship            | Association between entities.                                                         |
| `@ManyToOne`            | Annotation used to define a many-to-one relationship.                                  |
| `@OneToMany`            | Annotation used to define a one-to-many relationship.                                  |
| `@OneToOne`             | Annotation used to define a one-to-one relationship.                                   |
| `@ManyToMany`           | Annotation used to define a many-to-many relationship.                                 |
| Querying                | Process of retrieving data from the database.                                          |
| HQL (Hibernate Query Language) | Hibernate-specific language similar to SQL but operates on entities.            |
| Criteria API            | Programmatic way to define queries using a type-safe API.                              |
| **JPA**                 |                                                                                       |
| Entity                  | Represents a table in the database.                                                   |
| `@Entity`               | Annotation used to mark a Java class as an entity.                                    |
| `@Table`                | Annotation used to specify the table name for an entity.                             |
| `@Id`                   | Annotation used to define the primary key of an entity.                               |
| `@GeneratedValue`      | Annotation used to generate primary key values automatically.                         |
| Relationship            | Association between entities.                                                         |
| `@ManyToOne`            | Annotation used to define a many-to-one relationship.                                  |
| `@OneToMany`            | Annotation used to define a one-to-many relationship.                                  |
| `@OneToOne`             | Annotation used to define a one-to-one relationship.                                   |
| `@ManyToMany`           | Annotation used to define a many-to-many relationship.                                 |
| Querying                | Process of retrieving data from the database.                                          |
| JPQL (Java Persistence Query Language) | JPA-specific language similar to HQL but defined by the JPA specification.       |
| Criteria API            | Programmatic way to define queries using a type-safe API.                              |

## Theory Structure

### Hibernate

- **Entity**: Represents a table in the database.
- **`@Entity`**: Annotation used to mark a Java class as an entity.
- **`@Table`**: Annotation used to specify the table name for an entity.
- **`@Id`**: Annotation used to define the primary key of an entity.
- **`@GeneratedValue`**: Annotation used to generate primary key values automatically.
- **Relationship**: Association between entities.
  - **`@ManyToOne`**: Annotation used to define a many-to-one relationship.
  - **`@OneToMany`**: Annotation used to define a one-to-many relationship.
  - **`@OneToOne`**: Annotation used to define a one-to-one relationship.
  - **`@ManyToMany`**: Annotation used to define a many-to-many relationship.
- **Querying**: Process of retrieving data from the database.
  - **HQL (Hibernate Query Language)**: Hibernate-specific language similar to SQL but operates on entities.
  - **Criteria API**: Programmatic way to define queries using a type-safe API.

### JPA

- **Entity**: Represents a table in the database.
- **`@Entity`**: Annotation used to mark a Java class as an entity.
- **`@Table`**: Annotation used to specify the table name for an entity.
- **`@Id`**: Annotation used to define the primary key of an entity.
- **`@GeneratedValue`**: Annotation used to generate primary key values automatically.
- **Relationship**: Association between entities.
  - **`@ManyToOne`**: Annotation used to define a many-to-one relationship.
  - **`@OneToMany`**: Annotation used to define a one-to-many relationship.
  - **`@OneToOne`**: Annotation used to define a one-to-one relationship.
  - **`@ManyToMany`**: Annotation used to define a many-to-many relationship.
- **Querying**: Process of retrieving data from the database.
  - **JPQL (Java Persistence Query Language)**: JPA-specific language similar to HQL but defined by the JPA specification.
  - **Criteria API**: Programmatic way to define queries using a type-safe API.


# Hibernate vs. JPA

| Feature          | Hibernate                                     | JPA                                             |
|------------------|-----------------------------------------------|-------------------------------------------------|
| Definition       | ORM framework widely used in Java ecosystem.  | Java specification for ORM in Java EE and SE.   |
| Implementation   | Implementation of JPA specification.          | Standard specification for ORM in Java.         |
| Level of Abstraction | Low-level, provides fine-grained control over database operations. | High-level, abstracts database interactions.   |
| Configuration    | Requires additional configuration for setup.  | Built into Java EE and Spring frameworks.       |
| Performance      | Offers high performance due to optimized query execution. | Performance may vary depending on JPA provider. |
| Flexibility      | Provides flexibility to customize mappings and configurations. | Offers less flexibility compared to Hibernate. |
| Learning Curve   | Steeper learning curve due to its advanced features. | Relatively easier to learn, especially for beginners. |
| Vendor Lock-in   | May lead to vendor lock-in due to Hibernate-specific features. | Promotes vendor independence by adhering to standards. |
| Community Support | Large community and extensive documentation available. | Community support may vary depending on JPA provider. |
| Portability      | Less portable as it relies on Hibernate-specific features. | More portable, allows switching between different JPA implementations. |
| Usage with Spring Boot | Compatible with Spring Boot, requires additional configuration. | Built-in support in Spring Boot via `spring-boot-starter-data-jpa` dependency. |



# Hibernate Method and Functionality:
| Hibernate Method          | Functionality                                                                |
|---------------------------|------------------------------------------------------------------------------|
| save(entity)              | Saves the entity to the database.                                            |
| saveOrUpdate(entity)      | Saves or updates the entity based on its existence in the database.          |
| update(entity)            | Updates the entity in the database.                                          |
| delete(entity)            | Deletes the entity from the database.                                         |
| get(entityClass, id)      | Retrieves an entity from the database by its primary key.                     |
| load(entityClass, id)     | Lazy loads an entity from the database by its primary key.                    |
| createQuery(hql)          | Creates a Hibernate Query Language (HQL) query.                               |
| createCriteria(entityClass) | Creates a Criteria query for the specified entity class.                     |
| setFlushMode(mode)        | Sets the flush mode for the session.                                          |
| beginTransaction()        | Begins a transaction.                                                         |
| commit()                  | Commits the transaction.                                                      |
| rollback()                | Rolls back the transaction.                                                    |
| evict(entity)             | Detaches the entity from the session.                                         |

# JPA Method and Functionality

| JPA Method                | Functionality                                                                |
|---------------------------|------------------------------------------------------------------------------|
| save(entity)              | Saves the entity to the database.                                            |
| saveAll(entities)         | Saves a collection of entities to the database.                              |
| findById(id)              | Retrieves an entity by its primary key.                                      |
| findAll()                 | Retrieves all entities from the database.                                     |
| delete(entity)            | Deletes the entity from the database.                                         |
| deleteById(id)            | Deletes an entity by its primary key.                                         |
| flush()                   | Flushes pending changes to the database.                                      |
| count()                   | Counts the number of entities in the database.                                |
| existsById(id)            | Checks if an entity exists in the database by its primary key.                 |
| findAll(Sort)             | Retrieves all entities from the database sorted by the specified criteria.    |
| findAll(Pageable)         | Retrieves entities from the database paginated and sorted by the specified criteria. |
| @Query                    | Annotation to define custom JPQL or native SQL queries.                        |
| @Transactional            | Annotation to specify transactional behavior for methods or classes.          |





