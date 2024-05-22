import java.util.Scanner;

public class Print1ToNUsingRecursion {
    
    void printNumberTillN(int i, int n){
        
        if(i<=n){
            System.out.println(i);
            printNumberTillN(i+1, n);
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        Print1ToNUsingRecursion obj = new Print1ToNUsingRecursion();
        obj.printNumberTillN(1,n);
    }
}
