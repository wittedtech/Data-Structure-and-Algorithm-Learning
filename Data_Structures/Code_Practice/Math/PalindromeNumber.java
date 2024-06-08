package Data_Structures.Code_Practice.Math;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        // First Way
        // int left = 0 ;
        // int right = String.valueOf(x).length()-1;
        // while(left<right){
        //     int mid = left + (right-left)/2;
        //     if(String.valueOf(x).charAt(left)!=String.valueOf(x).charAt(right)){
        //         return false;
        //     }
        //     left++;
        //     right--;
        // }
        // return true;

        // Second Way
        int sum =0 , target = x;
        while(x>0){
            int temp = x%10;
            sum = sum*10 + temp;
            x = x/10;
        }
        return sum == target;
    }

    public static void main(String[] args) {
        int x = 12321;
        PalindromeNumber obj = new PalindromeNumber();
        System.out.println(obj.isPalindrome(x));
    }
}
