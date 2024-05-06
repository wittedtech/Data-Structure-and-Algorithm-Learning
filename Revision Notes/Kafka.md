# Apache Kafka Concepts and Code Examples in Spring Boot

---

## Introduction to Apache Kafka

Apache Kafka is a distributed streaming platform designed for building real-time streaming data pipelines and applications. It provides high throughput, fault tolerance, scalability, and durability.

---

## Core Concepts

### Topics

- **Logical Channels**: Topics are logical channels or feeds to which producers write data and from which consumers read data.
- **Partitioned Logs**: Each topic is split into partitions, which are ordered, immutable sequences of records.

### Producers

- **Data Publisher**: Producers publish (write) records to Kafka topics.
- **Record**: A record consists of a key, a value, and a timestamp.

### Consumers

- **Data Subscriber**: Consumers subscribe to topics and consume (read) records from them.
- **Consumer Group**: A group of consumers that jointly consume a topic.
- **Offsets**: Consumers keep track of their position in each partition with offsets.

### Broker

- **Kafka Server**: Broker is a Kafka server that stores topic partitions and serves client requests.

### ZooKeeper

- **Coordination Service**: Kafka uses ZooKeeper for distributed coordination and metadata management.

---

## Core Concepts in Spring Boot Application

### Setting Up Kafka in Spring Boot

1. Add Kafka dependency in `pom.xml`:

```xml
<dependency>
    <groupId>org.springframework.kafka</groupId>
    <artifactId>spring-kafka</artifactId>
</dependency>
```
2. Create Kafka properties in application.properties:
```properties
spring.kafka.bootstrap-servers=localhost:9092
```
3. **Creating a Producer**
   
   ```java
   @Component
    public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String topic, String message) {
        kafkaTemplate.send(topic, message);
        }
    }
   ```
4. **Creating a Consumer**
   ```java
   @Component
    public class KafkaConsumer {

        @KafkaListener(topics = "myTopic")
        public void receiveMessage(String message) {
            System.out.println("Received message: " + message);
        }
    }
    ```

## Advanced Concepts

### Consumer Groups and Load Balancing

When multiple consumers subscribe to a topic within the same consumer group, Kafka dynamically assigns partitions to consumers in the group. This enables load balancing and parallel processing of messages.

#### Example: Load Balancing in Consumer Group

Suppose we have three consumers (consumer1, consumer2, consumer3) in the same group (myGroup) subscribing to a topic (myTopic). Kafka automatically distributes partitions among consumers in the group for load balancing.

##### Graphical Representation

Producer -> [ Kafka Topic ] <- Consumer Group (Consumer1, Consumer2, Consumer3)

# Conclusion

Understanding Apache Kafka concepts such as producers, consumers, topics, consumer groups, and load balancing is essential for building real-time streaming applications. Integrating Kafka with Spring Boot simplifies the development process and enables robust and scalable streaming solutions.

