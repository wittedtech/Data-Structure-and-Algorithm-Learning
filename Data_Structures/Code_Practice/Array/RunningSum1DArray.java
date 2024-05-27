package Data_Structures.Code_Practice.Array;
/* 1480. Running Sum of 1d Array

Hint
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
Example 3:

Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]
 

Constraints:

1 <= nums.length <= 1000
-10^6 <= nums[i] <= 10^6
 */
public class RunningSum1DArray {
    public int[] runningSum(int [] nums){
        int [] res = new int [nums.length];
        for(int i=0; i<nums.length; i++){
            int sum =0;
            for(int j=0; j<=i; j++){
                sum += nums[j];
            }
            res[i] = sum;
        }
        return res;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        RunningSum1DArray obj = new RunningSum1DArray();
        int [] res = obj.runningSum(nums);
        for(int i=0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}
