package Data_Structures.Code_Practice.Array;

/* 2574. Left and Right Sum Differences

Hint
Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:

answer.length == nums.length.
answer[i] = |leftSum[i] - rightSum[i]|.
Where:

leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
Return the array answer.

 

Example 1:

Input: nums = [10,4,8,3]
Output: [15,1,11,22]
Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].
Example 2:

Input: nums = [1]
Output: [0]
Explanation: The array leftSum is [0] and the array rightSum is [0].
The array answer is [|0 - 0|] = [0].
 

Constraints:

1 <= nums.length <= 1000
1 <= nums[i] <= 105
 */
public class LeftAndRightSumDifferences {
    public int[] leftRightDifference(int[] nums) {
        int [] res = new int [nums.length];
        int i = 0;
        while(i<nums.length){
            int leftSum = 0;
            int rightSum = 0;
            for(int j=0; j<i; j++){
                leftSum += nums[j];
            }
            for(int k=i+1; k<nums.length; k++){
                rightSum += nums[k];
            }
            res[i] = leftSum<rightSum ? rightSum - leftSum : leftSum - rightSum;
            i++;
        }
        return res;
    }
    public static void main(String[] args) {
        LeftAndRightSumDifferences obj = new LeftAndRightSumDifferences();
        int [] nums = {10,4,8,3};
        int [] res = obj.leftRightDifference(nums);
        for(int i=0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}
