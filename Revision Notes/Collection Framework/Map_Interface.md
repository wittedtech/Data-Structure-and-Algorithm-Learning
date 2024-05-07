# Map Interface:


## SortedMap :

| Topic                  | Description                                                                                                                                                                                                                           |
|------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Definition             | A `SortedMap` is a sub-interface of the `Map` interface in Java, which maintains its elements in sorted order. It ensures that the keys are arranged in ascending order by default or according to a specified comparator.          |
| Time Complexity       | - `put(key, value)`: O(log n) <br> - `get(key)`: O(log n) <br> - `remove(key)`: O(log n) <br> - `containsKey(key)`: O(log n) <br> - `containsValue(value)`: O(n)                                                                    |
| Space Complexity      | O(n)                                                                                                                                                                                                                                  |
| Internal Working      | Typically implemented using self-balancing binary search trees like Red-Black Trees or AVL Trees.                                                                                                                                    |
| Enterprise Use        | Storing user session data where sessions need to be sorted based on session start time.                                                                                                                                               |
| Iterable              | Yes, `SortedMap` is iterable.                                                                                                                                                                                                         |
| Synchronized          | No, `SortedMap` is not synchronized.                                                                                                                                                                                                  |
| Thread Safe           | No, `SortedMap` is not thread-safe.                                                                                                                                                                                                   |
| Thread Safety Method  | To make `SortedMap` thread-safe, you can use `Collections.synchronizedSortedMap()` method.                                                                                                                                           |
| Syntax                | `SortedMap<K, V> sortedMap = new TreeMap<>();`                                                                                                                                                                                       |
| Similar Data Structure| `TreeMap` in Java.                                                                                                                                                                                                                   |
| Pros                  | - Maintains elements in sorted order. <br> - Provides efficient retrieval operations.                                                                                                                                                 |
| Cons                  | - Higher time complexity for some operations compared to other data structures like `HashMap`. <br> - Not thread-safe by default.                                                                                                    |



## NavigableMap

| Topic                  | Description                                                                                                                                                                                                                            |
|------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Definition             | `NavigableMap` is a sub-interface of the `SortedMap` interface in Java, providing navigation methods for accessing elements based on their relationship to other elements. It extends `SortedMap` to allow the retrieval of elements based on closest matches to given targets. |
| Time Complexity       | - `put(key, value)`: O(log n) <br> - `get(key)`: O(log n) <br> - `remove(key)`: O(log n) <br> - `containsKey(key)`: O(log n) <br> - `containsValue(value)`: O(n)                                                                     |
| Space Complexity      | O(n)                                                                                                                                                                                                                                   |
| Internal Working      | Typically implemented using self-balancing binary search trees like Red-Black Trees or AVL Trees, similar to `SortedMap`.                                                                                                             |
| Enterprise Use        | Storing data where elements need to be accessed based on closest matches to given targets, such as retrieval of nearest neighbors in geographical applications.                                                                         |
| Iterable              | Yes, `NavigableMap` is iterable.                                                                                                                                                                                                      |
| Synchronized          | No, `NavigableMap` is not synchronized.                                                                                                                                                                                               |
| Thread Safe           | No, `NavigableMap` is not thread-safe.                                                                                                                                                                                                |
| Thread Safety Method  | To make `NavigableMap` thread-safe, you can use `Collections.synchronizedNavigableMap()` method.                                                                                                                                      |
| Syntax                | `NavigableMap<K, V> navigableMap = new TreeMap<>();`                                                                                                                                                                                  |
| Similar Data Structure| `TreeMap` in Java.                                                                                                                                                                                                                    |
| Pros                  | - Provides navigation methods for accessing elements based on their relationship to other elements. <br> - Supports retrieval of elements based on closest matches to given targets.                                                  |
| Cons                  | - Similar time complexity to `SortedMap`, which may be higher for some operations compared to other data structures like `HashMap`. <br> - Not thread-safe by default.                                                              |



## ConcurrentMap

| Topic                  | Description                                                                                                                                                                                                                            |
|------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Definition             | `ConcurrentMap` is an interface in Java that extends the `Map` interface and provides thread-safe operations for concurrent access. It allows multiple threads to modify the map concurrently while ensuring consistency and correctness.   |
| Time Complexity       | - `put(key, value)`: O(1) (average case) <br> - `get(key)`: O(1) (average case) <br> - `remove(key)`: O(1) (average case) <br> - `containsKey(key)`: O(1) (average case) <br> - `containsValue(value)`: O(n)                   |
| Space Complexity      | O(n)                                                                                                                                                                                                                                   |
| Internal Working      | Internally uses techniques like locks or atomic operations to provide thread-safe access to the underlying data structure, typically a hash table or a tree-based structure.                                                     |
| Enterprise Use        | In multi-threaded applications where multiple threads need to access and modify a shared map concurrently, such as caching systems or message processing systems.                                                                   |
| Iterable              | Yes, `ConcurrentMap` is iterable.                                                                                                                                                                                                      |
| Synchronized          | Yes, `ConcurrentMap` provides inherent synchronization for thread-safe access.                                                                                                                                                         |
| Thread Safe           | Yes, `ConcurrentMap` is thread-safe by design.                                                                                                                                                                                         |
| Thread Safety Method  | N/A                                                                                                                                                                                                                                    |
| Syntax                | `ConcurrentMap<K, V> concurrentMap = new ConcurrentHashMap<>();`                                                                                                                                                                      |
| Similar Data Structure| `HashMap` or `TreeMap` combined with external synchronization mechanisms like `Collections.synchronizedMap()`.                                                                                                                        |
| Pros                  | - Provides efficient thread-safe operations for concurrent access. <br> - High-performance concurrent access for read and write operations.                                                                                          |
| Cons                  | - Higher space complexity compared to non-concurrent data structures. <br> - Iterating over a `ConcurrentMap` may not provide a consistent view of the map due to concurrent modifications.                                          |


## TreeMap

| Topic                  | Description                                                                                                                                                                                                                            |
|------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Definition             | `TreeMap` is a class in Java that implements the `NavigableMap` interface and stores its elements in a sorted tree structure. It maintains its elements in ascending order based on the natural ordering of keys or a specified comparator. |
| Time Complexity       | - `put(key, value)`: O(log n) <br> - `get(key)`: O(log n) <br> - `remove(key)`: O(log n) <br> - `containsKey(key)`: O(log n) <br> - `containsValue(value)`: O(n)                                                                   |
| Space Complexity      | O(n)                                                                                                                                                                                                                                   |
| Internal Working      | Internally uses a self-balancing binary search tree, typically a Red-Black Tree, to store and organize its elements in sorted order.                                                                                                 |
| Enterprise Use        | Commonly used in applications where elements need to be stored and accessed in sorted order, such as in data analysis or scheduling systems.                                                                                       |
| Iterable              | Yes, `TreeMap` is iterable.                                                                                                                                                                                                           |
| Synchronized          | No, `TreeMap` is not synchronized.                                                                                                                                                                                                    |
| Thread Safe           | No, `TreeMap` is not thread-safe.                                                                                                                                                                                                     |
| Thread Safety Method  | To make `TreeMap` thread-safe, you can use `Collections.synchronizedSortedMap()` method.                                                                                                                                               |
| Syntax                | `TreeMap<K, V> treeMap = new TreeMap<>();`                                                                                                                                                                                            |
| Similar Data Structure| `SortedMap` and `NavigableMap` interfaces.                                                                                                                                                                                            |
| Pros                  | - Maintains elements in sorted order. <br> - Provides efficient retrieval operations.                                                                                                                                                  |
| Cons                  | - Higher time complexity for some operations compared to other data structures like `HashMap`. <br> - Not thread-safe by default.                                                                                                     |


## AbstractMap

| Topic                  | Description                                                                                                                                                                                                                            |
|------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Definition             | `AbstractMap` is an abstract class in Java that provides a skeletal implementation of the `Map` interface. It simplifies the process of creating custom map implementations by providing default implementations for certain methods.   |
| Time Complexity       | Depends on the concrete implementation of the `AbstractMap` subclass.                                                                                                                                                                  |
| Space Complexity      | Depends on the concrete implementation of the `AbstractMap` subclass.                                                                                                                                                                  |
| Internal Working      | `AbstractMap` provides default implementations for various `Map` methods like `put`, `get`, `remove`, etc., which can be overridden by subclasses to provide custom functionality.                                                    |
| Enterprise Use        | Often used as a base class for creating custom map implementations tailored to specific use cases in applications.                                                                                                                     |
| Iterable              | Depends on the concrete implementation of the `AbstractMap` subclass.                                                                                                                                                                  |
| Synchronized          | Depends on the concrete implementation of the `AbstractMap` subclass.                                                                                                                                                                  |
| Thread Safe           | Depends on the concrete implementation of the `AbstractMap` subclass.                                                                                                                                                                  |
| Thread Safety Method  | Depends on the concrete implementation of the `AbstractMap` subclass.                                                                                                                                                                  |
| Syntax                | `AbstractMap<K, V> abstractMap = new AbstractMap<>() { /* Implementation here */ };`                                                                                                                                                    |
| Similar Data Structure| `HashMap`, `TreeMap`, `ConcurrentHashMap`, etc., which implement the `Map` interface.                                                                                                                                                 |
| Pros                  | - Simplifies the creation of custom map implementations by providing default method implementations. <br> - Encapsulates common functionality for map implementations.                                                               |
| Cons                  | - Cannot be instantiated directly as it is an abstract class. <br> - Requires overriding methods to provide custom behavior in subclasses.                                                                                           |


## ConcurrentHashMap

| Topic                  | Description                                                                                                                                                                                                                            |
|------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Definition             | `ConcurrentHashMap` is a class in Java that implements the `ConcurrentMap` interface, providing a thread-safe implementation of a hash table. It allows multiple threads to read and write concurrently without blocking each other.    |
| Time Complexity       | - `put(key, value)`: O(1) (average case) <br> - `get(key)`: O(1) (average case) <br> - `remove(key)`: O(1) (average case) <br> - `containsKey(key)`: O(1) (average case) <br> - `containsValue(value)`: O(n)                   |
| Space Complexity      | O(n)                                                                                                                                                                                                                                   |
| Internal Working      | Internally uses a hash table with multiple segments to allow concurrent access to different parts of the map. Each segment acts as an independent hash table, reducing contention during concurrent operations.                    |
| Enterprise Use        | Widely used in multi-threaded applications where high concurrency and performance are required for map operations, such as caching systems or web servers.                                                                         |
| Iterable              | Yes, `ConcurrentHashMap` is iterable.                                                                                                                                                                                                  |
| Synchronized          | No, `ConcurrentHashMap` is not synchronized.                                                                                                                                                                                           |
| Thread Safe           | Yes, `ConcurrentHashMap` is thread-safe.                                                                                                                                                                                               |
| Thread Safety Method  | N/A                                                                                                                                                                                                                                    |
| Syntax                | `ConcurrentHashMap<K, V> concurrentHashMap = new ConcurrentHashMap<>();`                                                                                                                                                               |
| Similar Data Structure| `HashMap` combined with external synchronization mechanisms like `Collections.synchronizedMap()`.                                                                                                                                     |
| Pros                  | - Provides efficient thread-safe operations for concurrent access. <br> - High-performance concurrent access for read and write operations.                                                                                          |
| Cons                  | - Higher space complexity compared to non-concurrent data structures. <br> - Iterating over a `ConcurrentHashMap` may not provide a consistent view of the map due to concurrent modifications.                                    |


## EnumMap

| Topic                  | Description                                                                                                                                                                                                                            |
|------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Definition             | `EnumMap` is a specialized implementation of the `Map` interface in Java, designed for use with enum keys. It is highly efficient and compact, internally implemented as an array.                                                  |
| Time Complexity       | - `put(key, value)`: O(1) <br> - `get(key)`: O(1) <br> - `remove(key)`: O(1) <br> - `containsKey(key)`: O(1) <br> - `containsValue(value)`: O(n)                                                                                   |
| Space Complexity      | O(n), where n is the number of enum constants.                                                                                                                                                                                        |
| Internal Working      | Internally implemented as an array where the index corresponds to the ordinal value of the enum constant. This allows for efficient and direct access to elements.                                                                   |
| Enterprise Use        | Commonly used when the keys of a map are known to be enum constants, providing type safety and efficient storage.                                                                                                                     |
| Iterable              | Yes, `EnumMap` is iterable.                                                                                                                                                                                                           |
| Synchronized          | No, `EnumMap` is not synchronized.                                                                                                                                                                                                    |
| Thread Safe           | No, `EnumMap` is not thread-safe.                                                                                                                                                                                                     |
| Thread Safety Method  | To make `EnumMap` thread-safe, you can use `Collections.synchronizedMap()` method.                                                                                                                                                     |
| Syntax                | `EnumMap<EnumType, ValueType> enumMap = new EnumMap<>(EnumType.class);`                                                                                                                                                               |
| Similar Data Structure| `HashMap`, but specifically designed for enum keys, providing better performance and memory efficiency when dealing with enum constants.                                                                                          |
| Pros                  | - Efficient and compact storage for enum keys. <br> - Provides type safety for keys.                                                                                                                                                   |
| Cons                  | - Limited to use with enum keys only. <br> - Not thread-safe by default. <br> - Higher time complexity for `containsValue(value)` operation compared to other map implementations.                                                     |


## HashMap

| Topic                  | Description                                                                                                                                                                                                                            |
|------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Definition             | `HashMap` is a class in Java that implements the `Map` interface, providing a data structure that stores key-value pairs. It uses a hash table to store the elements, allowing for fast retrieval of values based on their keys.    |
| Time Complexity       | - `put(key, value)`: O(1) (average case) <br> - `get(key)`: O(1) (average case) <br> - `remove(key)`: O(1) (average case) <br> - `containsKey(key)`: O(1) (average case) <br> - `containsValue(value)`: O(n)                   |
| Space Complexity      | O(n)                                                                                                                                                                                                                                   |
| Internal Working      | Internally uses a hash table to store key-value pairs. Each element is stored in a bucket based on its hash code, allowing for efficient retrieval based on key hashes.                                                              |
| Enterprise Use        | Widely used in various enterprise applications for storing and retrieving data efficiently. Common use cases include caching, data storage, and lookup tables.                                                                     |
| Iterable              | Yes, `HashMap` is iterable.                                                                                                                                                                                                           |
| Synchronized          | No, `HashMap` is not synchronized.                                                                                                                                                                                                    |
| Thread Safe           | No, `HashMap` is not thread-safe.                                                                                                                                                                                                     |
| Thread Safety Method  | To make `HashMap` thread-safe, you can use `Collections.synchronizedMap()` method.                                                                                                                                                     |
| Syntax                | `HashMap<K, V> hashMap = new HashMap<>();`                                                                                                                                                                                            |
| Similar Data Structure| `HashTable` (legacy), `ConcurrentHashMap`, `LinkedHashMap`.                                                                                                                                                                            |
| Pros                  | - Provides fast insertion, deletion, and lookup operations. <br> - Offers flexibility and versatility for storing key-value pairs. <br> - Generally provides good performance for most use cases.                                  |
| Cons                  | - Not thread-safe by default. <br> - Requires synchronization for concurrent access in multi-threaded environments. <br> - Iteration order is not guaranteed to be consistent across different executions or versions of Java. |


## IdentityHashMap

| Topic                  | Description                                                                                                                                                                                                                            |
|------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Definition             | `IdentityHashMap` is a class in Java that implements the `Map` interface, providing a specialized map implementation where keys are compared based on reference equality (`==`) instead of object equality (`equals()`).          |
| Time Complexity       | - `put(key, value)`: O(1) (average case) <br> - `get(key)`: O(1) (average case) <br> - `remove(key)`: O(1) (average case) <br> - `containsKey(key)`: O(1) (average case) <br> - `containsValue(value)`: O(n)                   |
| Space Complexity      | O(n)                                                                                                                                                                                                                                   |
| Internal Working      | Internally uses an array-based data structure to store key-value pairs. Keys are compared using reference equality (`==`) rather than object equality (`equals()`).                                                                  |
| Enterprise Use        | Less common in enterprise applications compared to `HashMap`. However, it can be useful in scenarios where object identity is crucial for key comparison, such as in class loaders or serialization contexts.                         |
| Iterable              | Yes, `IdentityHashMap` is iterable.                                                                                                                                                                                                    |
| Synchronized          | No, `IdentityHashMap` is not synchronized.                                                                                                                                                                                             |
| Thread Safe           | No, `IdentityHashMap` is not thread-safe.                                                                                                                                                                                              |
| Thread Safety Method  | To make `IdentityHashMap` thread-safe, you can use `Collections.synchronizedMap()` method.                                                                                                                                              |
| Syntax                | `IdentityHashMap<K, V> identityHashMap = new IdentityHashMap<>();`                                                                                                                                                                     |
| Similar Data Structure| `HashMap`, but with different key comparison semantics based on reference equality (`==`).                                                                                                                                           |
| Pros                  | - Keys are compared based on reference equality (`==`). <br> - Useful in scenarios where object identity is crucial for key comparison.                                                                                               |
| Cons                  | - Not commonly used compared to `HashMap`. <br> - Not thread-safe by default. <br> - Iteration order is not guaranteed to be consistent across different executions or versions of Java.                                              |


## LinkedHashMap

| Topic                  | Description                                                                                                                                                                                                                            |
|------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Definition             | `LinkedHashMap` is a class in Java that extends `HashMap` and maintains a doubly-linked list to preserve the insertion order of its elements. It combines the fast lookup performance of `HashMap` with predictable iteration order. |
| Time Complexity       | - `put(key, value)`: O(1) (average case) <br> - `get(key)`: O(1) (average case) <br> - `remove(key)`: O(1) (average case) <br> - `containsKey(key)`: O(1) (average case) <br> - `containsValue(value)`: O(n)                   |
| Space Complexity      | O(n)                                                                                                                                                                                                                                   |
| Internal Working      | Internally uses a hash table to store key-value pairs, similar to `HashMap`. Additionally, maintains a doubly-linked list to preserve the insertion order of elements.                                                                  |
| Enterprise Use        | Commonly used in scenarios where preserving the insertion order of elements is important, such as implementing caches or maintaining the order of configuration settings.                                                           |
| Iterable              | Yes, `LinkedHashMap` is iterable.                                                                                                                                                                                                      |
| Synchronized          | No, `LinkedHashMap` is not synchronized.                                                                                                                                                                                               |
| Thread Safe           | No, `LinkedHashMap` is not thread-safe.                                                                                                                                                                                                |
| Thread Safety Method  | To make `LinkedHashMap` thread-safe, you can use `Collections.synchronizedMap()` method.                                                                                                                                               |
| Syntax                | `LinkedHashMap<K, V> linkedHashMap = new LinkedHashMap<>();`                                                                                                                                                                           |
| Similar Data Structure| `HashMap` with the added feature of maintaining insertion order.                                                                                                                                                                        |
| Pros                  | - Maintains the insertion order of elements. <br> - Provides fast lookup performance similar to `HashMap`.                                                                                                                            |
| Cons                  | - Higher memory overhead compared to `HashMap` due to maintaining the linked list for insertion order. <br> - Not thread-safe by default. <br> - Iteration order is not guaranteed to be consistent across different executions or versions of Java. |


## HashTable

| Topic                  | Description                                                                                                                                                                                                                            |
|------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Definition             | `HashTable` is a class in Java that implements the `Map` interface and provides a synchronized, thread-safe implementation of a hash table data structure. It is similar to `HashMap`, but it is synchronized, making it thread-safe. |
| Time Complexity       | - `put(key, value)`: O(1) (average case) <br> - `get(key)`: O(1) (average case) <br> - `remove(key)`: O(1) (average case) <br> - `containsKey(key)`: O(1) (average case) <br> - `containsValue(value)`: O(n)                   |
| Space Complexity      | O(n)                                                                                                                                                                                                                                   |
| Internal Working      | Internally uses a hash table data structure similar to `HashMap`. However, it provides synchronized access to its methods to ensure thread safety.                                                                                   |
| Enterprise Use        | Less common in modern enterprise applications compared to `ConcurrentHashMap`, due to its synchronized nature, which may lead to performance degradation in highly concurrent scenarios.                                           |
| Iterable              | Yes, `HashTable` is iterable.                                                                                                                                                                                                         |
| Synchronized          | Yes, `HashTable` is synchronized.                                                                                                                                                                                                      |
| Thread Safe           | Yes, `HashTable` is thread-safe.                                                                                                                                                                                                       |
| Thread Safety Method  | N/A                                                                                                                                                                                                                                    |
| Syntax                | `Hashtable<K, V> hashTable = new Hashtable<>();`                                                                                                                                                                                      |
| Similar Data Structure| `HashMap`, but with inherent synchronization for thread-safe access.                                                                                                                                                                   |
| Pros                  | - Provides thread-safe access to its methods. <br> - Suitable for scenarios where thread safety is a primary concern.                                                                                                                  |
| Cons                  | - Inherent synchronization may lead to performance degradation in highly concurrent scenarios. <br> - Iteration order is not guaranteed to be consistent across different executions or versions of Java.                         |


## Properties

| Topic                  | Description                                                                                                                                                                                                                            |
|------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Definition             | `Properties` is a class in Java that represents a persistent set of properties. It extends `Hashtable` and is typically used for handling configuration and application settings, such as database connection parameters or UI settings.|
| Time Complexity       | Depends on the operations performed on the underlying `Hashtable`.                                                                                                                                                                     |
| Space Complexity      | Depends on the number of key-value pairs stored in the `Properties` object.                                                                                                                                                             |
| Internal Working      | Internally uses a `Hashtable` to store key-value pairs.                                                                                                                                                                                 |
| Enterprise Use        | Commonly used in enterprise applications for managing configuration settings, storing resource bundles, and handling application-specific properties.                                                                           |
| Iterable              | Yes, `Properties` is iterable.                                                                                                                                                                                                         |
| Synchronized          | Yes, `Properties` is synchronized.                                                                                                                                                                                                     |
| Thread Safe           | Yes, `Properties` is thread-safe.                                                                                                                                                                                                      |
| Thread Safety Method  | N/A                                                                                                                                                                                                                                    |
| Syntax                | ```java
                          Properties properties = new Properties();
                          properties.setProperty("key", "value");
                          String value = properties.getProperty("key");
                        ```                                                                                                                                                                                                                   |
| Similar Data Structure| `HashMap` or `Hashtable`, but specifically designed for managing key-value pairs of configuration settings.                                                                                                                         |
| Pros                  | - Provides a convenient way to handle configuration settings and application properties. <br> - Inherent synchronization for thread-safe access.                                                                                 |
| Cons                  | - Not suitable for large-scale data storage or complex data structures. <br> - Iteration order is not guaranteed to be consistent across different executions or versions of Java.                                                  |


# Comparison: 

## HashMap vs ConcurrentHashMap

| Aspect                | HashMap                                                     | ConcurrentHashMap                                                                                   |
|-----------------------|-------------------------------------------------------------|-----------------------------------------------------------------------------------------------------|
| Synchronization       | Not synchronized.                                           | Internally synchronized, providing thread-safe access to its methods.                               |
| Thread Safety         | Not thread-safe.                                            | Thread-safe.                                                                                        |
| Performance           | Generally faster in single-threaded scenarios.               | Suitable for highly concurrent scenarios due to its optimized concurrency control mechanisms.       |
| Concurrency Control   | Doesn't support concurrent modifications, may lead to       | Supports concurrent modifications by using a finer-grained locking mechanism called                |
|                       | ConcurrentModificationException or data corruption          | segment locking, allowing multiple threads to read and write concurrently without blocking each   |
|                       | in concurrent scenarios.                                    | other.                                                                                              |
| Iteration Order       | Iteration order is not guaranteed to be consistent           | Iteration order is not guaranteed to be consistent across different executions or versions of Java.|
|                       | across different executions or versions of Java.             |                                                                                                     |
| Memory Overhead       | Lower memory overhead compared to ConcurrentHashMap.         | Higher memory overhead due to additional concurrency control mechanisms.                             |
| Use Cases             | Suitable for single-threaded or low-concurrency scenarios.    | Suitable for highly concurrent scenarios where thread safety and performance are crucial.           |
| Example               | ```java                                                     | ```java                                                                                             |
|                       | HashMap<String, Integer> map = new HashMap<>();             | ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();                               |
|                       | map.put("key", 1);                                          | map.put("key", 1);                                                                                  |
|                       | int value = map.get("key");                                 | int value = map.get("key");                                                                         |
|                       | ```                                                         | ```                                                                                                 |



## HashMap vs HashTable

| Aspect                | HashMap                                                       | HashTable                                                                                           |
|-----------------------|---------------------------------------------------------------|-----------------------------------------------------------------------------------------------------|
| Synchronization       | Not synchronized.                                             | Synchronized, providing thread-safe access to its methods.                                           |
| Thread Safety         | Not thread-safe.                                              | Thread-safe.                                                                                       |
| Performance           | Generally faster due to lack of synchronization overhead.     | Slower due to synchronized access, especially in highly concurrent scenarios.                        |
| Concurrency Control   | Doesn't support concurrent modifications, may lead to         | Supports concurrent modifications by using a global lock, allowing only one thread                    |
|                       | ConcurrentModificationException or data corruption            | to access the table at a time, which can lead to contention in high-concurrency scenarios.           |
| Iteration Order       | Iteration order is not guaranteed to be consistent             | Iteration order is not guaranteed to be consistent across different executions or versions of Java.  |
|                       | across different executions or versions of Java.               |                                                                                                     |
| Memory Overhead       | Lower memory overhead compared to HashTable.                   | Higher memory overhead due to synchronized access and additional concurrency control mechanisms.      |
| Use Cases             | Suitable for single-threaded or low-concurrency scenarios.    | Suitable for scenarios where thread safety is paramount and performance is not a concern.             |
| Example               | ```java                                                       | ```java                                                                                             |
|                       | HashMap<String, Integer> map = new HashMap<>();               | Hashtable<String, Integer> table = new Hashtable<>();                                               |
|                       | map.put("key", 1);                                            | table.put("key", 1);                                                                               |
|                       | int value = map.get("key");                                   | int value = table.get("key");                                                                      |
|                       | ```                                                           | ```                                                                                                 |

