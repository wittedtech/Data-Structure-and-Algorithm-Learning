package Sorting_Algorithms;

public class SelectionSort {
    // Selection Sort
    // Time Complexity = O(n^2);
    // Also an unstable sorting algorithm.
    public static void printArray(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr = {12,2,16,8,1};
        for(int i=0; i<arr.length-1;i++){
            int smallest = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[smallest]){
                    smallest = j;
                }
            }
            //swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
}
