/*
 * 42. Trapping Rain Water
Hard
28.9K
412
Companies
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

 

Example 1:


Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:

Input: height = [4,2,0,3,2,5]
Output: 9
 

Constraints:

n == height.length
1 <= n <= 2 * 104
0 <= height[i] <= 105
 */

 class Solution {
    public int trap(int[] a) {
      int res = 0;

      int[] lb = new int[a.length];
      int[] rb = new int[a.length];

      lb[0] = a[0];
      for(int i=1; i<a.length-1;i++){
         lb[i] = Math.max(a[i], lb[i-1]);
      }

      rb[a.length-1] = a[a.length-1];
      for(int i=a.length-2; i>=0;i--){
         rb[i] = Math.max(a[i], rb[i+1]);
      }

      for(int i=1; i<a.length-1;i++){
          res = res + Math.min(lb[i],rb[i])-a[i];
      }
      return res;
    }
}