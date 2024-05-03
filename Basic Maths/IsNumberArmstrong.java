import java.util.Scanner;


/*
 * ARMSTRONG NUMBERS : Number whose sum of cube of every digit is equal to original number .
 * 
 * For Example : 371 is an Armstrong Number Because : 
 * 3*3*3 = 27
 * 7*7*7 = 343
 * 1*1*1 = 1
 * 
 * Hence : 343+1+27 == 371
 * 
 */
public class IsNumberArmstrong {
    boolean isArmstrong(int n){
        int dup = n;
        int sum =0;
        while (n>0){
            int lastDigit = n%10;
            sum += (lastDigit*lastDigit*lastDigit);
            n=n/10;
        }
        if(sum == dup) return true;
        else return false;
    }

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        IsNumberArmstrong obj = new IsNumberArmstrong();
        System.out.println(obj.isArmstrong(n));
    }
    
}
