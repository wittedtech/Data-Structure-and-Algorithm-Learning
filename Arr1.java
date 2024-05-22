import java.util.Arrays;

public class Arr1 {

    public static void occurenceCount(int [] arr){
        int n = arr.length;
        // Can Also Use sort method if want to use inbuilt method of Arrays.
        Arrays.sort(arr);
        // for (int i = 0; i < arr.length - 1; i++) {
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if (arr[i] > arr[j]) {
        //             int temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }
        for(int i=0; i<n; i++){
            int count =1;
            while(i+1<n && arr[i] == arr[i+1]){
                count ++;
                i++;
            }
            System.out.println("Integer: "+arr[i]+" -> Count :"+count);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,3,2,5,6,3,2,5,4,3,4};
        occurenceCount(arr);
    }
}
