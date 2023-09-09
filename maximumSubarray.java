/*
 * 53. Maximum Subarray
Medium
31.9K
1.3K
Companies
Given an integer array nums, find the 
subarray
 with the largest sum, and return its sum.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 
 */

public class maximumSubarray {
    class Solution {
        public int maxSubArray(int[] a) {

            int maxSum = a[0];
            int sum = a[0];

            for (int i = 1; i < a.length; i++) {

                sum = Math.max(a[i], sum + a[i]);

                maxSum = Math.max(maxSum, sum);
            }

            return maxSum;
        }
    }

}
