import java.util.Scanner;

class PrintNTimesUsingRecursion{
    void printNTimes(int n){
        
        if(n>0){
            System.out.println("Harshit");
            printNTimes(n-1);
        }
        
    }

    public static void main(String args []){
        Scanner scanner = new Scanner(System.in);
        int newNum = scanner.nextInt();
        scanner.close();
        PrintNTimesUsingRecursion obj = new PrintNTimesUsingRecursion();
        obj.printNTimes(newNum);
    }
}
// Why This code is giving error "Could not find or load main class"? 