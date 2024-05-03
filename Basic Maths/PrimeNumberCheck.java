/*  Prime Number : The basic definition we all know is => Number which is divisible by 1 and itself is 
the prime number .For Example : 1 is divisible by 1 and itself but 1 is not a prime number.

Which is correct somehow but for the better understanding always remember that =>

Number which has excatly and only 2 factors one of them is 1 and second one is the Number itself are truly the 
prime numbers.
*/

import java.util.Scanner;

public class PrimeNumberCheck {
    // Time Complexity : O(n)
    boolean isPrimeNumber(int n){
        if (n <= 1) {
            return false;
        } else {
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    
    // Time Complexity : O(sqrt(n))
    boolean isPrimeNumberUsingSqrt(int n){
        int count = 0;
        for(int i=1; i*i<=n; i++){
            if(n%i ==0){
                count++;
                if((n/i) != i){
                    count ++;
                }
            }
        }
        if(count == 2) return true;
        else return false;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        PrimeNumberCheck obj = new PrimeNumberCheck();
        System.out.println("Is Prime Number: "+obj.isPrimeNumber(n));
        System.out.println("Is Prime Number: "+obj.isPrimeNumberUsingSqrt(n));
    }
}
