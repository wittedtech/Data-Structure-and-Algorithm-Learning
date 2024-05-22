import java.util.Scanner;

public class PrintNTo1UsingRecursion {
    void printReverseFromN(int i, int n){
        if(n>=i){
            System.out.println(n);
            printReverseFromN(i, n-1);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        PrintNTo1UsingRecursion obj = new PrintNTo1UsingRecursion();
        obj.printReverseFromN(1,n);
    }
}
