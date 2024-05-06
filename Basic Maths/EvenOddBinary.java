import java.util.Scanner;

public class EvenOddBinary {
    String evenOddCheck(int n){
        if((n & 1) == 0){
            return "Even";
        }else{
            return "Odd";
        }
    }

    public static void main(String ...args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        EvenOddBinary obj = new EvenOddBinary();
        System.out.println(obj.evenOddCheck(n));
    }
}
