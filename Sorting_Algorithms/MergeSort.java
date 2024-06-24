package Sorting_Algorithms;
// Follows Divide and Conquer methodology .

// Time Complexity = O(nlogn)

public class MergeSort {

    public static void conquer(int[] arr, int si, int mid, int ei){
        System.out.println("start index: "+si +"mid index: "+mid+" end index: "+ ei);
        int [] merged = new int[ei-si+1]; // ei-si+1 to get exact size for new merged array.
        System.out.println("merged size: "+merged.length );
        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;
        while(idx1<= mid && idx2<=ei){
            System.out.println("index 1: "+idx1+" index 2: "+idx2+" mid index: "+mid+" end index: "+ei);
            if(arr[idx1] <= arr[idx2]){
                System.out.println("x: "+x+" idx1: "+idx1);
                merged[x++] = arr[idx1++];
                System.out.println("x: "+x+" idx1: "+idx1);
            }else{
                System.out.println("x: "+x+" idx2: "+idx2);
                merged[x++] = arr[idx2++];
                System.out.println("x: "+x+" idx2: "+idx2);
            }
        }
        // in case elements remaining in first arr,
        while(idx1 <= mid){
            System.out.println("x: "+x+" idx1: "+idx1);
            merged[x++] = arr[idx1++];
            System.out.println("x: "+x+" idx1: "+idx1);
        }

        // in case elements left in second arr,
        while(idx2 <= ei){
            System.out.println("x: "+x+" idx2: "+idx2);
            merged[x++] = arr[idx2++];
            System.out.println("x: "+x+" idx2: "+idx2);
        }

        for(int i=0, j=si; i<merged.length; i++, j++){
            arr[j] = merged[i];
        }
    }
    public static void divide(int[] arr, int si, int ei){
        System.out.println("start index: "+si +" end index: "+ ei);
        for(int i=si;i<=ei; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        if(si>= ei){
            return;
        }
        int mid = si+(ei-si)/2;
        System.out.println("start index: "+si +" mid index: "+mid+" end index: "+ ei);
        System.out.println("calling : divide(arr, si, mid)");
        divide(arr, si, mid);
        System.out.println("start index: "+si +" mid+1 index: "+ (mid+1));
        System.out.println("calling : divide(arr, mid+1, ei)");
        divide(arr, mid+1, ei);
        System.out.println("start index: "+si +" mid index: "+mid+" end index: "+ ei);
        System.out.println("calling : conquer(arr, si, mid, ei)");
        conquer(arr, si, mid, ei);
        System.out.println("--------------------------------------");
    }
    public static void main(String[] args) {

        int [] arr = {12,2,16,8,1};
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        divide(arr, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
