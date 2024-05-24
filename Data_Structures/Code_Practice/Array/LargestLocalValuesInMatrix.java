package Data_Structures.Code_Practice.Array;

/*2373. Largest Local Values in a Matrix

Hint
You are given an n x n integer matrix grid.

Generate an integer matrix maxLocal of size (n - 2) x (n - 2) such that:

maxLocal[i][j] is equal to the largest value of the 3 x 3 matrix in grid centered around row i + 1 and column j + 1.
In other words, we want to find the largest value in every contiguous 3 x 3 matrix in grid.

Return the generated matrix.

 

Example 1:


Input: grid = [[9,9,8,1],[5,6,2,6],[8,2,6,4],[6,2,2,2]]
Output: [[9,9],[8,6]]
Explanation: The diagram above shows the original matrix and the generated matrix.
Notice that each value in the generated matrix corresponds to the largest value of a contiguous 3 x 3 matrix in grid.
Example 2:


Input: grid = [[1,1,1,1,1],[1,1,1,1,1],[1,1,2,1,1],[1,1,1,1,1],[1,1,1,1,1]]
Output: [[2,2,2],[2,2,2],[2,2,2]]
Explanation: Notice that the 2 is contained within every contiguous 3 x 3 matrix in grid.
 

Constraints:

n == grid.length == grid[i].length
3 <= n <= 100
1 <= grid[i][j] <= 100 */

public class LargestLocalValuesInMatrix {
    public int[][] largestLocal(int[][] grid) {
        // grid.length-2 : because it's told in question that we need n-2*n-2 grid for result;
        int [][] maxLocal = new int [grid.length-2][grid.length-2];
        for(int i=0; i<grid.length-2; i++){ //row
            for(int j=0; j<grid.length-2; j++){ //column
                int max =0;
                for(int k=i;k<i+3;k++){ // 
                    for(int l=j;l<j+3; l++){
                        max = Math.max(grid[k][l], max);
                    }
                }
                maxLocal[i][j] = max;
            }
        }
        return maxLocal;
    }

    public static void main (String args[]){
        LargestLocalValuesInMatrix obj = new LargestLocalValuesInMatrix();
        int [][] grid = {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
        for(int i=0; i<obj.largestLocal(grid).length; i++){
            for(int j=0; j<obj.largestLocal(grid).length; j++){
                System.out.print(obj.largestLocal(grid)[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
