package Basic_Recursion;
import java.util.Scanner;

// Using Functional Recursion i.e. Operation are getting performed and dependent on function structure.
public class SumOfFirstNNumbersUsingFunction{

    int sumOfNNumbers(int n){
        if(n==0){
            return n;
        }
        return n + sumOfNNumbers(n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        SumOfFirstNNumbersUsingFunction obj = new SumOfFirstNNumbersUsingFunction();
        System.out.println(obj.sumOfNNumbers(n));
    }
}
