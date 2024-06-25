public class XpowNwithStackHeightlogn {
    public static int pow(int x , int n){
        if(x==0) return 0;
        if(n==0) return 1;
        //for even power
        /* Stack Height = log(n) */
        if(n%2 ==0){
            return pow(x,n/2)*pow(x, n/2);
        }else{
            return pow(x, n/2)*pow(x, n/2)*x;
        }
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(pow(x, n));
    }
}
