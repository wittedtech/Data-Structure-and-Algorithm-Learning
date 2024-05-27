package Data_Structures.Code_Practice.Array;

import java.util.Arrays;

/*1637. Widest Vertical Area Between Two Points Containing No Points

Hint
Given n points on a 2D plane where points[i] = [xi, yi], Return the widest vertical area between two points such that no points are inside the area.

A vertical area is an area of fixed-width extending infinitely along the y-axis (i.e., infinite height). The widest vertical area is the one with the maximum width.

Note that points on the edge of a vertical area are not considered included in the area.

 

Example 1:

​
Input: points = [[8,7],[9,9],[7,4],[9,7]]
Output: 1
Explanation: Both the red and the blue area are optimal.
Example 2:

Input: points = [[3,1],[9,0],[1,0],[1,4],[5,3],[8,8]]
Output: 3
 

Constraints:

n == points.length
2 <= n <= 105
points[i].length == 2
0 <= xi, yi <= 109 */

public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a,b) -> Integer.compare(a[0], b[0]));
        int ans = 0;
        for(int i=1; i<points.length; i++){
            ans = Math.max(ans, points[i][0]-points[i-1][0]);
        }
        return ans;
    }

    public static void main(String[] args) {
        WidestVerticalAreaBetweenTwoPointsContainingNoPoints obj = new WidestVerticalAreaBetweenTwoPointsContainingNoPoints();
        int [][] points = {{8,7},{9,9},{7,4},{9,7}};
        System.out.println(obj.maxWidthOfVerticalArea(points));
    }
}
