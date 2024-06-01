package Data_Structures.Code_Practice.Array;
/* 34. Find First and Last Position of Element in Sorted Array
Medium

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
 

Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109
 */

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0){
            return new int [] {-1, -1};
        }
        int [] res = new int [2];
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                res[0] = i;
                break;
            }else{
                res[0] = -1;
            }
        }
        for(int i=nums.length-1; i>=0; i--){
            if(nums[i] == target){
                res[1] = i;
                break;
            }else{
                res[1] = -1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        FindFirstAndLastPositionOfElementInSortedArray obj = new FindFirstAndLastPositionOfElementInSortedArray();
        int [] nums = {1};
        int [] res = obj.searchRange(nums, 0);
        for(int i=0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}
