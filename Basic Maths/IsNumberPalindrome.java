import java.util.Scanner;

/*
 * PALINDROME NUMBERS : Number which when reversed is same as original number. 
 * 
 * For Example : 121 when reversed it again 121 hence it's Palindrome.
 * 
 */
class IsNumberPalindrome{
    boolean isPalindrome(int n){
        int revNum = 0;
        int loopVar = n;
        while(loopVar>0){
            int lastDigit = loopVar%10;
            loopVar = loopVar/10;
            revNum = revNum*10 + lastDigit;
        }
        if(revNum == n){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String ...args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        IsNumberPalindrome obj = new IsNumberPalindrome();
        System.out.println(obj.isPalindrome(n));
    }
}