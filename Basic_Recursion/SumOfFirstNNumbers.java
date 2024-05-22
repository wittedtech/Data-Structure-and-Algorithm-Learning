
import java.util.Scanner;

// Using Parameterized Recursion i.e. Operation are getting performed and dependent on prameters.
public class SumOfFirstNNumbers{

    int sumOfNNumbers(int i, int sum){
        if(i<1){
            return sum;
        }
        return sumOfNNumbers(i-1, sum+i);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        SumOfFirstNNumbers obj = new SumOfFirstNNumbers();
        System.out.println(obj.sumOfNNumbers(n, 0));
    }
}
