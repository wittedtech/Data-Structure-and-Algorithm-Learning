public class TowerOfHanoiRecursion {
    // Time Complexity = O(n^2);
    public static void towerOfHanoi(int n, String source, String helper, String Destination){
        if(n==1){
            System.out.println("Move disk 1 from "+source+" to "+Destination);
            return;
        }

        towerOfHanoi(n-1, source, Destination, helper);
        System.out.println("Move disk "+n+" from "+source+" to "+Destination);
        towerOfHanoi(n-1, helper, source, Destination);

    }
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n,"Source","Helper","Destination");
    }
}
