package Data_Structures.Code_Practice.Array;

import java.util.Arrays;

/* 16. 3Sum Closest
Medium

Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.

 

Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
Example 2:

Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
 

Constraints:

3 <= nums.length <= 500
-1000 <= nums[i] <= 1000
-104 <= target <= 104
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int res = 0;
        int length = nums.length;
        if(length<3) return res;

        Arrays.sort(nums);
        int max = Integer.MAX_VALUE;
        for(int i=0; i<length-2; i++){
            int left = i+1;
            int right = length -1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == target) return sum;
                else if(sum<target){
                    left ++;
                }else{
                    right --;
                }
                int diff = Math.abs(sum - target);
                if(diff < max){
                    max = diff;
                    res = sum;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        ThreeSumClosest threeSumClosest = new ThreeSumClosest();
        int [] nums = {-1,2,1,-4};
        System.out.println(threeSumClosest.threeSumClosest(nums, 1));
        int [] nums1 = {0,0,0};
        System.out.println(threeSumClosest.threeSumClosest(nums1, 1));
    }
}
