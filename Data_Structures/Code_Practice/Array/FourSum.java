package Data_Structures.Code_Practice.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 18. 4Sum
Medium

Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.

 

Example 1:

Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
Example 2:

Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]
 

Constraints:

1 <= nums.length <= 200
-109 <= nums[i] <= 109
-109 <= target <= 109
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int length = nums.length;
        if(length<4) return res;
        Arrays.sort(nums);
        for(int i=0; i<length-3; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            for(int j=i+1; j<length-2; j++){
                if(j>i+1 && nums[j] == nums[j-1]) continue;
                int left = j+1;
                int right = length -1;
                while(left<right){
                    long sum = (long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum == target){
                    res.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));

                    while(left<right && nums[left] == nums[left+1]) left++;
                    while(left<right && nums[right] == nums[right-1]) right--;

                    left++;
                    right--;
                    }else if(sum<target) {
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        FourSum fourSum = new FourSum();
        // int [] nums = {1,0,-1,0,-2,2};
        // System.out.println(fourSum.fourSum(nums, 0));
        // int [] nums1 = {2,2,2,2,2};
        // System.out.println(fourSum.fourSum(nums1, 8));

        int [] nums = {1000000000,1000000000,1000000000,1000000000};
        System.out.println(fourSum.fourSum(nums, -294967296));
    }
}
