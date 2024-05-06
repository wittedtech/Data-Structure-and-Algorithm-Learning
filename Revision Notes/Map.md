# Map in Java: Revision Notes

---

## Introduction to Map

- **Map Interface**: Part of the Java Collections Framework.
- **Key-Value Pair**: Stores elements in key-value pairs.
- **Uniqueness**: Keys are unique; each key maps to at most one value.
- **Implementation Classes**: Various implementation classes like HashMap, TreeMap, LinkedHashMap, etc.

---

## Basic Operations

```java
// Creating a Map
Map<KeyType, ValueType> map = new HashMap<>();

// Adding Elements 
map.put(key, value);

//Accessing Elements
ValueType value = map.get(key);

//Removing Elements
ValueType removedValue = map.remove(key);

//Checking Existence
boolean containsKey = map.containsKey(key);
boolean containsValue = map.containsValue(value);

```
### Map Common Methods

- **size():** Returns the number of key-value mappings in the map.
- **isEmpty():** Returns true if the map contains no key-value mappings.
- **clear():** Removes all key-value mappings from the map.

### Iterating Over Map

- **Using EntrySet**
  ```Java
  for (Map.Entry<KeyType, ValueType> entry : map.entrySet()) {
    KeyType key = entry.getKey();
    ValueType value = entry.getValue();
    // Process key-value pair
    }


- **Using KeySet & Values**
   - `keySet()` returns a Set
  ```Java
  for (KeyType key : map.keySet()) {
    ValueType value = map.get(key);
    // Process key-value pair
    }
    ```
### Map Implementations

#### HashMap

- **Performance:** Provides constant-time performance for basic operations.
- **Ordering:** Does not guarantee any specific order of elements.
- **Bucket:** Internal data structure where key-value pairs are stored.
- **Hash Collision:** Two different keys having the same hash code.
- **Resizing:** Automatically increases the size of the bucket array when load factor exceeds a threshold.

#### TreeMap

- **Ordered:** Maintains ascending order of keys.
- **Performance:** Logarithmic time cost for basic operations.
- **Red-Black Tree:** Internally uses a red-black tree for storage.

#### LinkedHashMap

- **Ordering:** Maintains insertion order or access order.
- **Performance:** Slightly slower than HashMap due to maintaining order.

#### ConcurrentHashMap

- **Concurrency:** Provides thread-safe operations without explicit synchronization.
- **Scalability:** Supports high concurrency by dividing the map into segments.

#### WeakHashMap

- Entries with weak keys are automatically removed from the map when the key is no longer referenced elsewhere.

## Advanced Concepts

### Custom Objects as Keys

Objects used as keys must override equals() and hashCode() methods.

### Null Values

HashMap allows one null key and any number of null values.

### Performance Considerations

Choose the appropriate implementation based on requirements (HashMap for general use, TreeMap for sorting, ConcurrentHashMap for concurrency).

### Iteration Order

- TreeMap provides keys in ascending order by default.
- LinkedHashMap maintains insertion order or access order based on the constructor used.

### Concurrent Modification Exception

Concurrent modification of the map while iterating can lead to ConcurrentModificationException.

### Functional Operations

Stream API: Allows functional operations like map, filter, flatMap on Map entries.

# Summary

- **Map:** Key-value pairs data structure.
- **Implementation Classes:** HashMap, TreeMap, LinkedHashMap, ConcurrentHashMap, WeakHashMap.
- **Common Operations:** Add, access, remove elements; check existence; iterate over entries.
- **Performance:** Choose the appropriate implementation based on requirements.
- **Concurrency:** ConcurrentHashMap provides thread-safe operations.
- **Advanced Concepts:** Custom keys, null values, iteration order, concurrent modification, WeakHashMap, bucket, hash collision, resizing.
- **Functional Operations:** Use of functional operations like flatMap for advanced processing of Map entries.


  


