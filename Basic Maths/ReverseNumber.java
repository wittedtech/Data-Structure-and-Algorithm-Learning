import java.util.Scanner;

public class ReverseNumber {
    int reverseNumber(int n){
        int revNum = 0;
        while(n>0){
            int lastDigit = n%10;
            n= n/10;
            revNum = revNum*10 + lastDigit;
        }
        return revNum;
    }

    public static void main(String ...args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        ReverseNumber obj = new ReverseNumber();
        System.out.println(obj.reverseNumber(n));
    }
    
}
