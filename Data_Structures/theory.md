# **Data Structure :**
 Data Structure is a collection of data and the functions that operate on them.
 - **Importance :** 
   - Efficient Data Mamagement.
   - Data Organization.
   - Data Abstraction.
   - Reusabililty.
   - Algorithm Optimization.
 - **Types :**
   - **Linear Data Structure :** These structures store data in a sequential order. Insertion and Deletion is easy in these type of data structures.
   - **Non-Linear Data Structure :** Stores data in a heirarchical or interconnected manner ; allows more complex relationship between data elements.
  
## Linear Data Structure :
- **[Array](array.md) :** collection of data having same data type. Store in a [Contigous Memory](#contigous-memory).
- **[Linked List](linkedList.md) :** Collection of elements linked together by pointers (in java refered as Nodes). Allows dynamic insertion and deletion.
- **[Queue](queue.md) :** Follows First-In-First-Out (FIFO) structure. In this elements gets add in the last index (end) and removed from the first index (beginning).
- **[Stack](stack.md) :** Follow Last-In-First-Out (LIFO) structure. In this elements gets added and removed from the top (i.e. First Index) only.
  
## Non-Linear Data Structure :
- **[Tree](tree.md) :** Heirarchical structure where each node can have multiple child nodes.
            ![Tree](https://static.javatpoint.com/ds/images/tree4.png) 
    ```java
    class Node  
        {  
        int data; 

        Node *left;  
        Node *right;   
        }  
    ``` 
    - **Left :** Left Will Store the left child node address or else blank ( i.e. No Need to create left node ). 
    ```java 
    struct node *left 
    ```
    - **Right :** Right Will Store the right child node address or else blank ( i.e. No Need to create right node ).
    ```java 
    struct node *right 
    ```
    - **Data :** Stores Data.
- **[Graph](graph.md) :** Collection of nodes (When talking about graphs usually called as *vertex*) connected by edges. Use to represents relationship between data elements.\
            ![Graphical Reresentation](https://www.baeldung.com/wp-content/uploads/2018/11/graph1.jpg)
    - In this Graph there are 5 Vertexes and 6 Edges. 
      - Vertexes : Represented in circle form.
      - Edges : Represented with lines indicating relationship between all the vertexes.
- **[Hash Table](hashTable.md) :** Uses a *Hash Function* to map keys to values. Allows fast lookup and insertion. Hash table is basically an array of indexes and indexes are known as bucket/slot. Simply putting this as that Map Converts Keys in to *HashCode* using different *Hashing Algorithm* for different Data Types; Hash Code helps in recognising the place of bucket (i.e. which index of which array is going to store this particular key). 



### Contigous Memory
 Contigous Memory Allocation is a type of memory allocation algorithm which allocates contigous memory i.e. assigning an fixed size of memory for a particular task and whole memory space resides in a specified location.