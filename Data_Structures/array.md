# Array
- Linear Data Structure.
- Store data of similar data types.
- Stores in a Contigous Memory.
- Allows constant-time excess.
- Each element hash uniques index number.

\
\
## Types Of Array :
  - [1D Array](#1d-array) (int[], String[], etc.)
  - 2D Array (int[][], String[][], etc.)
  - Multi-dimensional Array (int[][][], etc.)
  - Dynamic Array (ArrayList)

## Methods List Used in Array :
These are amethod provided by Arrays from the Utility package in java. i.e. `java.util.Arrays`

| Method              | Use                                     | Example                             |
|---------------------|-----------------------------------------|-------------------------------------|
| Arrays.sort()       | Sorts an array                          | Arrays.sort(array);                 |
| Arrays.fill()       | Fills an array with a single value      | Arrays.fill(array, 1);              |
| Arrays.toString()   | Converts an array to a string           | Arrays.toString(array);             |
| Arrays.copyOf()     | Copies an array                         | Arrays.copyOf(original, length);   |
| Arrays.equals()     | Compares two arrays                     | Arrays.equals(array1, array2);      |
| Arrays.binarySearch() | Searches an array for a specific element | Arrays.binarySearch(array, key); |
| Arrays.asList()     | Converts an array to a list             | Arrays.asList(array);               |
| Arrays.copyOfRange() | Copies a range of an array              | Arrays.copyOfRange(array, start, end); |
| Arrays.parallelSort() | Sorts an array in parallel              | Arrays.parallelSort(array);         |
| Arrays.stream()     | Creates a stream from an array          | Arrays.stream(array);               |

## Operations On Array :
1. **Array Initialization and Display :**
   ```java
   // Initialize array
    int[] array = {10, 20, 30, 40, 50};

    // Display array elements
    System.out.println("Array elements:");
    for (int i = 0; i < array.length; i++) {
        System.out.println("Element at index " + i + ": " + array[i]);
    }

   ```
2. **Array Insertion:**
    ```java
    // Insert an element at a specific index
    int index = 2;
    int elementToInsert = 25;
    int[] newArray = new int[array.length + 1];
    for (int i = 0, j = 0; i < newArray.length; i++) {
        if (i == index) {
            newArray[i] = elementToInsert;
        } else {
            newArray[i] = array[j++];
        }
    }
    array = newArray;

    ```
3. **Array Deletion:**
    ```java
    // Delete an element at a specific index
    int indexToDelete = 3;
    int[] newArray = new int[array.length - 1];
    for (int i = 0, j = 0; i < array.length; i++) {
        if (i != indexToDelete) {
            newArray[j++] = array[i];
        }
    }
    array = newArray;

    ```
4. **Array Searching:**
    ```java
    // Search for an element in the array
    int key = 30;
    boolean found = false;
    for (int i = 0; i < array.length; i++) {
        if (array[i] == key) {
            System.out.println("Element " + key + " found at index " + i);
            found = true;
            break;
        }
    }
    if (!found) {
        System.out.println("Element not found");
    }

    ```
5. **Array Traversal:**
    ```java
    // Traverse the array and perform some operation
    for (int element : array) {
        System.out.println("Processing element: " + element);
        // Perform operation on element
    }

    ```
6. **Array Update:**
    ```java
    // Update an element at a specific index
    int indexToUpdate = 2;
    int newValue = 35;
    array[indexToUpdate] = newValue;

    ```

### 1D Array
- Array of a single dimension.
- Defining 1D Array :
  -  Declaration: int[] array;
  -  Initialization: array = new int[5]; 
  -  Combined to create array : int[] array = new int[5];
    ```java
    class singleDimensionArray{
        /*
         * Declaration: int[] array;
         * Initialization: array = new int[5];
         * Combined to create array : int[] array = new int[5];
        */
        int [] intArrayWithSize = new int[5]; // Array of Type Integer and Size 5.
        int [] intArrayWithSizeAndData = new int[5]{1,2,3,4,5}; // Array of Type Int and Size 5.
        String [] stringArrayWithSize = new String[5]; // Array of Type String and Size 5.
        String [] stringArrayWithSizeAndData = new String []{"Ram","Shyam","Seeta","Gita"}; // Array of Type String and Size 4.
        // Same Goes for Every Different Data Type.
    }
    ```
- Passing Array as parameter in method body : Declaration is passed in method parameter i.e. `int[] array`
  
        ```java
        void sumArray(int[] array) {}
        ```
- Returning Array from a method : Initialization is returned from a method body i.e. `new int[]{}`
- Returning Array from a method : 1. Initialization is returned from a method body i.e. `return new int[]{`*Data*`}`
                                  2. Declared variable name can also be returned i.e. `return variable_Declared`.
    ```java
    class singleDimensionArray{
        int [] array(int[] array){
            return new int[] {1,2,3,4,5};
        }
        int [] arrayVar (int [] array){
            int [] arrVariable = new int[]{};
            return arrVariable;
        }
    }
    ``` 
- Accessing Array Elements : `array[index]` where index is the position of the element in the array.
  
### 2D Array
- Array of a two dimension.
- Also known as `Matrix`.
- Stores elements in Grid, consisting rows and columns.
- Defining 2D Array:
```java
// Declaration and initialization
int[][] matrix = new int[3][3]; // 3x3 matrix -> 3 rows and 3 columns
int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // Initializing with values

```
- Accessing Elements:
```java
int value = matrix[row][column];
```
- Displaying Elements:
```java
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}

```

#### Operations:
1. Insertion: You can insert elements by assigning values to specific indices.

2. Deletion: You cannot directly delete elements from a 2D array, but you can set them to some default value or create a new array without the element you want to "delete".

3. Searching: Similar to 1D arrays, you can perform linear or binary search depending on whether the array is sorted.

4. Traversal: Iterate through all elements using nested loops.

5. Update: Update elements by assigning new values to specific indices.
   
#### Common Tasks: 
1. Transpose: Swap rows and columns.
```java
int[][] transpose = new int[matrix[0].length][matrix.length];
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        transpose[j][i] = matrix[i][j];
    }
}
```

2. Adding Two Matrices:
```java
int[][] result = new int[matrix1.length][matrix1[0].length];
for (int i = 0; i < matrix1.length; i++) {
    for (int j = 0; j < matrix1[i].length; j++) {
        result[i][j] = matrix1[i][j] + matrix2[i][j];
    }
}
```

3. Multiplying Two Matrices:
```java
int[][] result = new int[matrix1.length][matrix2[0].length];
for (int i = 0; i < matrix1.length; i++) {
    for (int j = 0; j < matrix2[0].length; j++) {
        for (int k = 0; k < matrix2.length; k++) {
            result[i][j] += matrix1[i][k] * matrix2[k][j];
        }
    }
}
```

4. Checking if a Matrix is Symmetric:
```java
boolean isSymmetric = true;
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] != matrix[j][i]) {
            isSymmetric = false;
            break;
        }
    }
}
```

5. Checking if a Matrix is Identity:
```java
boolean isIdentity = true;
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        if (i == j && matrix[i][j] != 1) {
            isIdentity = false;
            break;
        } else if (i != j && matrix[i][j] != 0) {
            isIdentity = false;
            break;
        }
    }
}
```

#### Note:
- 2D arrays can have varying lengths of rows, but each row must have the same length.
- You can use nested loops to traverse and perform operations on a 2D array.
- Many algorithms and data structures involve the use of 2D arrays, such as dynamic programming problems and game boards.
  
### 3D Array:
<!--- Continue After 1D Array and 2D Array. ---> 

  

  
