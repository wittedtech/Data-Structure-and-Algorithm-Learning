public class XpowN {

    public static int pow(int x, int n){
        if(x==0) return 0;
        if(n==0) return 1;
        return x*pow(x, n-1);

    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(pow(x, n));
    }    
}
