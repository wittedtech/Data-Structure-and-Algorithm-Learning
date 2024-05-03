import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AllDivisors {
    /*
     * This method will take Big Oh of n time cpmplexity to gets executed .
     * TIME COMPLEXITY : O(n);
     */

    /*
     * Getting all divisors mean dividing the number with every number greater than 1 and less than number itself.
     */
    void allDivisor(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0) System.out.print(i+" ");            
        }
    }

    void allDivisorInSqrtTimeComplexity(int n){
        List<Integer> list = new ArrayList<>();
        // Time Complexity of this Loop : O(sqrt(n));
        for(int i=1; i<= Math.sqrt(n); i++){
        //for(int i=1; i*i<=n; i++){
            if(n%i ==0){
                list.add(i);
                if(n/i != i){
                    list.add(n/i);
                }
            }
        }
        // Inter Sorting algorithm takes : O(n log n) . Here n = no of factors or elements in the list.
        Collections.sort(list);

        // Time Complexity of this Loop is : Big Oh of n == O(n). Again n = number of elements or factors.
        for(int ele : list){
            System.out.print(ele + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        AllDivisors obj = new AllDivisors();
        obj.allDivisor(n);
        System.out.println();
        obj.allDivisorInSqrtTimeComplexity(n);
    }
}
