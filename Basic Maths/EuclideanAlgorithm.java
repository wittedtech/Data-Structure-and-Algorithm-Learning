/*
 *              GCD(Greatest Common Divisor) and HCF(Highest Common Factor)
 * GCD or HCF is the greatest common divisor / factor of any two given numbers .
 * 
 * Here Comes the EUCLIDEAN ALGORITHM :
 * 
 * it states gcd(N1 , N2) == gcd(N1-N2, N2) when N1>N2 and repeat the process until one the number becmomes 0.
 * 
 * For Better Programming Understanding we can say that 
 * 
 * EUCLIDEAN ALGORITHM == GCD(Greater Number % Smaller Number, Smaller Number) and when one of them become 0;
 * other one will be the GCD of given two numbers.
 * 
 * TIME COMPLEXITY of EUCLIDEAN ALGORTIHM : Big Oh of Log phie of Minimun of both numbers.
 * i.e. O(log(base phie)(Min(a,b)))
 * 
 * Why Log ? => Because we already know whenever the iteration is reducing by division the time complexity will be
 * Logarithmic . 
 * 
 * Why Base Phie ? => Because when time complexity is in log we take base of the number which is dividing the 
 * iterating variable but here the iterating variable changing continuously as we are choosing the smaller
 * number everytime for divisor.
 */

import java.util.Scanner;

public class EuclideanAlgorithm {
    int gcd(int a, int b){
        while (a>0 && b>0) {
            if(a>b) a= a%b;
            else b = b%a;
        }
        if(a==0) return b;
        
        return a;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        EuclideanAlgorithm obj = new EuclideanAlgorithm();
        System.out.println(obj.gcd(a,b));
    }
}
