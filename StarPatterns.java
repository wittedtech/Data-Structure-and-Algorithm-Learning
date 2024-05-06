public class StarPatterns {

    void pattern1(int n){
        for(int i=1; i<n; i++){
            for(int j=1; j<n; j++){
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
    void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    void pattern5(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void pattern6(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    void pattern7(int n){
        for(int i=0; i<n; i++){
            //space
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            //star
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            //space
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    void pattern8(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*(n-i)-1; j++){
                System.out.print("*");
            }
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    void pattern9(int n){
        for(int i=0; i<=2*n-1; i++){
            int k = i>n?2*n-i:i;
            for(int j=0; j<k; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    void pattern10(int n){
        int start;
        for(int i=0; i<n; i++){
            if(i % 2 ==0)
                start = 1;
            else
                start = 0;
            for(int j=0; j<=i; j++){
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }

    void pattern11(int n){
        int space= 2*(n-1);
        for(int i=0; i<n; i++){
            for(int j=0; j<=i;){
                System.out.print(++j);
            }

            for(int j=0; j<space; j++){
                System.out.print(" ");
                
            }
            for(int j=i; j>=0; j-=2){
                System.out.print(++j);
            }
            System.out.println();
            space -= 2;
        }
    }

    void pattern13(int n){
        int num =1;
        for(int i=0; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print(num);
                num+=1;
            }
            System.out.println();
        }
    }

    void pattern14(int n){
        for(int i=0; i<n; i++){
            for(char ch='A'; ch<='A'+i; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    void pattern15(int n){
        for(int i=0; i<n; i++){
            for(char ch='A'; ch<='A'+(n-i-1); ch++){ 
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    void pattern16(int n){
        char ch='A';
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(ch);
            }
            System.out.println();
            ch++;
        }
    }

    void pattern17(int n){
        for(int i=0; i<n; i++){
            //space
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            //char
            char ch = 'A';
            int breakpoint= (2*i+1)/2;
            for(int j=0; j<2*i+1; j++){
                System.out.print(ch);
                if(j<=breakpoint) 
                    ch++;
                else 
                    ch--;
            }
            //space
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    void pattern18(int n){
        for(int i=0; i<n; i++){
            for(char ch=(char) ('E'-i); ch<='E'; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    void pattern19(int n){
        int inis = 0;
        for(int i=0; i<n; i++){
            //star
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }

            //space
            for(int j=0; j<inis; j++){
                System.out.print(" ");
                
            }

            //star
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            inis+=2;
            System.out.println();
        }
        inis=2*n-2;
        for(int i=0; i<n; i++){
            //star
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }

            //space
            for(int j=0; j<inis; j++){
                System.out.print(" ");
                
            }

            //star
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            inis-=2;
            System.out.println();
        }
    }

    void pattern20(int n){
        int space= 2*n-2;
        for(int i=1; i<2*n-1; i++){
            int stars= i;
            if(i>n) stars = 2*n-i;
            //stars
            for(int j=1 ; j<= stars; j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1; j<= space; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<n) space-=2;
            else space+=2;

        }
    }

    void pattern21(int n){
        for(int i=0; i<n; i++){
            for(int j=0 ; j<n; j++){
                if(i==0 || i==n-1 || j==0 || j==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    void pattern22(int n){
        for(int i=0; i<2*n-1; i++){
            for(int j=0; j<2*n-1; j++){
                int top= i;
                int left = j;
                int right = (2*n-2)-j;
                int bottom = (2*n-2)-i;
                System.out.print(" ");
                System.out.print(n-Math.min(Math.min(top, bottom),Math.min(left, right)));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        StarPatterns obj = new StarPatterns();
        int n=0;
        System.out.println("Pattern : "+(++n));
        obj.pattern1(5);
        System.out.println();
        System.out.println("Pattern : "+(++n));
        obj.pattern2(5);
        System.out.println();
        System.out.println("Pattern : "+(++n));
        obj.pattern3(5);
        System.out.println();
        System.out.println("Pattern : "+(++n));
        obj.pattern4(5);
        System.out.println();
        System.out.println("Pattern : "+(++n));
        obj.pattern5(5);
        System.out.println();
        System.out.println("Pattern : "+(++n));
        obj.pattern6(5);
        System.out.println();
        System.out.println("Pattern : "+(++n));
        obj.pattern7(5);
        System.out.println();
        System.out.println("Pattern : "+(++n));
        obj.pattern8(5);
        System.out.println();
        System.out.println("Pattern : "+(++n));
        obj.pattern9(5);
        System.out.println();
        System.out.println("Pattern : "+(++n));
        obj.pattern10(5);
        System.out.println();
        System.out.println("Pattern : "+(++n));
        obj.pattern11(5);
        System.out.println();
        System.out.println("Pattern : "+(++n));
        obj.pattern13(5);
        System.out.println();
        System.out.println("Pattern : "+(++n));
        obj.pattern14(5);
        System.out.println();
        System.out.println("Pattern : "+(++n));
        obj.pattern15(5);
        System.out.println();
        System.out.println("Pattern : "+(++n));
        obj.pattern16(5);
        System.out.println();
        System.out.println("Pattern : "+(++n));
        obj.pattern17(5);
        System.out.println();
        System.out.println("Pattern : "+(++n));
        obj.pattern18(5);
        System.out.println();
        System.out.println("Pattern : "+(++n));
        obj.pattern19(5);
        System.out.println();
        System.out.println("Pattern : "+(++n));
        obj.pattern20(5);
        System.out.println();
        System.out.println("Pattern : "+(++n));
        obj.pattern21(5);
        System.out.println();
        System.out.println("Pattern : "+(++n));
        obj.pattern22(5);

    }
}
