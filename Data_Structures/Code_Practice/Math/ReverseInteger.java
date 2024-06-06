package Data_Structures.Code_Practice.Math;

/* 
7. Reverse Integer
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 

Constraints:

-231 <= x <= 231 - 1

*/
public class ReverseInteger {
    public int reverse(int x) {
        int res = 0;
        while(x != 0){
            int rem = x%10;
            x = x/10;
            if((res>Integer.MAX_VALUE/10) || (res==Integer.MAX_VALUE/10 && rem>7)) return 0;
            if((res<Integer.MIN_VALUE/10) || (res == Integer.MIN_VALUE/10 && rem<-8)) return 0;

            res = (res*10)+rem;
        }
        return res;
    }

    public static void main(String[] args) {
        ReverseInteger obj = new ReverseInteger();
        int x = -1231;
        int res = obj.reverse(x);
        System.out.println(res);
    }
}
