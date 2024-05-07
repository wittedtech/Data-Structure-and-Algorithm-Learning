# Queue Interface in Java

The Queue interface in Java represents a collection of elements arranged in a specific order known as First-In-First-Out (FIFO). It extends the Collection interface and is a part of the Java Collections Framework. Here's a simple overview of the Queue interface:

- **FIFO Order**: Elements in a Queue are stored and accessed in the order they were added, with the first element added being the first one to be removed.
- **Enqueue and Dequeue**: The Queue interface provides methods to enqueue (add) elements to the end of the queue and dequeue (remove) elements from the front of the queue.
- **Insertion and Removal**: Queues support insertion and removal operations at both ends, allowing elements to be added to the rear and removed from the front.
- **Common Implementations**: Common implementations of the Queue interface include LinkedList and PriorityQueue.
- **Iterable**: Like other collection interfaces, Queue extends the Iterable interface, enabling it to be traversed using enhanced for loops.
- **Subinterfaces and Implementations**: Queue interface has subinterfaces like Deque and implementations like ArrayDeque to provide additional functionality and structure.

Overall, the Queue interface provides a convenient and efficient way to work with collections of elements in Java, especially when the order of insertion and removal is important.

### Blocking Queue:

| **Aspect**              | **Description**                                                                                     |
|-------------------------|-----------------------------------------------------------------------------------------------------|
| **Definition**          | - A BlockingQueue in Java is a type of queue that supports operations that wait for the queue to become non-empty when retrieving an element and wait for space to become available in the queue when storing an element. It extends the Queue interface and is part of the java.util.concurrent package. |
| **Time Complexity**     | - Depends on the underlying implementation.                                                         |
| **Space Complexity**    | - Depends on the underlying implementation.                                                         |
| **Internal Working**    | - Utilizes locking mechanisms to synchronize access and block threads when necessary.               |
| **Enterprise Example**  | - Used in multi-threaded applications where producers and consumers need to coordinate efficiently and safely.|
| **Iterable**            | - Yes, BlockingQueue implements the Iterable interface.                                              |
| **Synchronised**        | - No, BlockingQueue is not synchronized by default.                                                  |
| **Thread Safe**         | - Yes, BlockingQueue implementations are inherently thread-safe.                                      |
| **Why Thread Safe**     | - BlockingQueue implementations use locking mechanisms internally to ensure thread safety.            |
| **Making Thread Safe**  | - Not applicable. BlockingQueue implementations are already thread-safe.                             |
| **Syntax**              | - Depends on the specific implementation used (e.g., LinkedBlockingQueue, ArrayBlockingQueue).        |
| **Similar Data Struct.**| - Queue, PriorityBlockingQueue                                                                      |
| **Pros**                | - Provides a convenient way to coordinate between threads efficiently and safely.                   |
| **Cons**                | - May introduce overhead due to blocking operations, potential for deadlock if not used carefully.   |

