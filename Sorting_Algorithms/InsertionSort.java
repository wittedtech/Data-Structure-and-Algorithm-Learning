package Sorting_Algorithms;

public class InsertionSort {

    // Insertion Sort
    // Time Complexity = O(n^2);
    // It is an stable sorting algorithm.
    public static void printArray(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr = {12,2,16,8,1};
        // insertion sort
        for(int i=1; i<arr.length; i++){// unsorted part from index 1 to last
            int current = arr[i]; // current unsorted element to put in correct posittion in sorted part.
            int j = i-1; // last index of sorted part
            while(j>=0 && arr[j]>current){ /*loop condition for checking that index is not out of array and 
                also checking that element is greater than current unsorted element*/

                //keep swapping

                arr[j+1] = arr[j]; /*moving sorted part last index by +1 to create a space for new sorted
                element coming from unsorted part*/
                j--;
            }
            arr[j+1] = current; //current value is stored in it right position.
        }
        printArray(arr);
    }
}
