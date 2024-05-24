package Data_Structures.Code_Practice.Array;

import java.util.ArrayList;
import java.util.List;

// POWER SET :- Power Set is a set of all the subset of an set including null/phi (i.e. Blank) set (i.e. {}).

/*78. Subsets
Medium

Given an integer array nums of unique elements, return all possible 
subsets
 (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

 

Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]
 

Constraints:

1 <= nums.length <= 10
-10 <= nums[i] <= 10
All the numbers of nums are unique.
 */
public class SubsetOfArrays {
    List<List<Integer>> subsetArray(int [] arr){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        int index=0;
        subsetFinder(arr, ans, subset, index);
        return ans;
    }

    private void subsetFinder(int [] arr, List<List<Integer>> ans, List<Integer> subset, int index){
        if(index == arr.length){
            ans.add(new ArrayList<Integer>(subset));
            return;
        }
        //exclude the value
        subset.add(arr[index]);
        subsetFinder(arr, ans, subset, index+1);
        //include the value
        subset.remove(subset.size()-1);
        subsetFinder(arr, ans, subset, index+1);
        
    }

    public static void main(String[] args) {
        SubsetOfArrays obj = new SubsetOfArrays();
        int [] arr = {1,2,3};
        List<List<Integer>> ans = obj.subsetArray(arr);
        System.out.println(ans);
    }
    
}

// Drag Run :-
/*
subsetFinder(int [] arr, List<List<Integer>> ans, List<Integer> subset, int index)

 * subsetFinder([1, 2, 3], [], [], 0)
  |
  |--- subsetFinder([1, 2, 3], [], [1], 1)
  |       |
  |       |--- subsetFinder([1, 2, 3], [], [1, 2], 2)
  |       |       |
  |       |       |--- subsetFinder([1, 2, 3], [], [1, 2, 3], 3)
  |       |       |     |
  |       |       |     |--- ans.add([1, 2, 3])
  |       |       |     |
  |       |       |     |--- subset.remove(subset.size()-1)
  |       |       |
  |       |--- subsetFinder([1, 2, 3], [], [1, 3], 2)
  |             |
  |             |--- subsetFinder([1, 2, 3], [], [1, 3], 3)
  |                     |
  |                     |--- ans.add([1, 3])
  |                     |
  |                     |--- subset.remove(subset.size()-1)
  |
  |--- subsetFinder([1, 2, 3], [], [2], 1)
         |
         |--- subsetFinder([1, 2, 3], [], [2, 3], 2)
         |       |
         |       |--- subsetFinder([1, 2, 3], [], [2, 3], 3)
         |       |     |
         |       |     |--- ans.add([2, 3])
         |       |     |
         |       |     |--- subset.remove(subset.size()-1)
         |
         |--- subsetFinder([1, 2, 3], [], [3], 2)
               |
               |--- ans.add([3])
               |
               |--- subset.remove(subset.size()-1)

 * 
 */