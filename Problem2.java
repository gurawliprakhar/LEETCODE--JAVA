/*Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1] */

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = { -1, -1 };
        int l = 0, h = nums.length - 1, mid = 0;
        while (l <= h) {
            mid = l + (h - l) / 2;

            if (nums[mid] == target) {
                res[0] = mid;
                h = mid - 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        l = 0;
        h = nums.length - 1;
        while (l <= h) {
            mid = l + (h - l) / 2;

            if (nums[mid] == target) {
                res[1] = mid;
                l = mid + 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        return res;
    }
}
