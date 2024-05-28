package Data_Structures.Code_Practice.Array;

/* 1720. Decode XORed Array

Hint
There is a hidden integer array arr that consists of n non-negative integers.

It was encoded into another integer array encoded of length n - 1, such that encoded[i] = arr[i] XOR arr[i + 1]. For example, if arr = [1,0,2,1], then encoded = [1,2,3].

You are given the encoded array. You are also given an integer first, that is the first element of arr, i.e. arr[0].

Return the original array arr. It can be proved that the answer exists and is unique.

 

Example 1:

Input: encoded = [1,2,3], first = 1
Output: [1,0,2,1]
Explanation: If arr = [1,0,2,1], then first = 1 and encoded = [1 XOR 0, 0 XOR 2, 2 XOR 1] = [1,2,3]

Example 2:

Input: encoded = [6,2,7,3], first = 4
Output: [4,2,0,7,4]
 

Constraints:

2 <= n <= 104
encoded.length == n - 1
0 <= encoded[i] <= 105
0 <= first <= 105
 */
public class DecodeXORedArray {
    public int[] decode(int[] encoded, int first) {
        /* 
         * Basic Logic here to find XOR :
         * c = a^b
         * a = c^b
         * b = c^a
         * 
         * here we have c given in encode array in every index . to find next value 
         * we can do first^c and everytime increase encode index to get next c.
         * 
         */
        int n = encoded.length;
        int [] res = new int[n+1];
        res[0] = first;
        for(int i=0; i<n; i++){
            res[i+1] = res[i] ^ encoded[i];
        }
        return res;
    }

    public static void main(String[] args) {
        DecodeXORedArray obj = new DecodeXORedArray();
        int [] encoded = {1,2,3};
        int first = 1;
        int [] res = obj.decode(encoded,first);
        for(int i=0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}
