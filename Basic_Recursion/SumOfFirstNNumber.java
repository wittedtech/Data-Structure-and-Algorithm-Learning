import java.util.Scanner;

public class SumOfFirstNNumber {
    void sumOfNNumber(int sum, int n){
        
        if(n>=0){
            sum += n;
            sumOfNNumber(sum, n-1);
            
        }
        System.out.println(sum);
    }
    
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        obj.close();
        SumOfFirstNNumber obj1 = new SumOfFirstNNumber();
        obj1.sumOfNNumber(0,n);
    }
}
