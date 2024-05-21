package Basic_Recursion;

import java.util.Scanner;

// Palindrome : A String on reversal reads the same. Ex : "MADAM" is Palindrome.
public class StringPalindromeRecursion {

    boolean isPalindrome(String str, int i,int n){
        // Make sure to check upper lower case if the string have mixed cases like MADAM is palindorme but Madam
        // is not a palindorme
        if(i >= n/2) return true;
        if(str.charAt(i) != str.charAt(n-i-1)) return false;

        return isPalindrome(str, i+1,n);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        StringPalindromeRecursion obj = new StringPalindromeRecursion();
        int n = str.length();
        System.out.println(obj.isPalindrome(str, 0,n));
    }
}
