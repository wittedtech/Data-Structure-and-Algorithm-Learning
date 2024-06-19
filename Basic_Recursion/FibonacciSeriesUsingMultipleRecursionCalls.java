/**
 * FibonacciSeriesUsingMultipleRecursionCalls
 * 
 * FIBONACCI SERIES : Series starts with 0 & 1 and after that every number comes in this series is the sum of 
 * last two numbers of the series.
 * EX: 0 1 1 2 3 5 8 13 .......... n 
 * 
 */
public class FibonacciSeriesUsingMultipleRecursionCalls {
    
    public static void printFib(int a, int b, int n){
        if(n==0) return;

        int c = a+b;
        System.out.println(c);
        printFib(b, c, n-1);
    }
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);

        int n = 10;
        printFib(a, b, n-2);

    }
}