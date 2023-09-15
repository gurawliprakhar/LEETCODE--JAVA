/*
 * Easy
Topics
Companies
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 */

 
 
 class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> elementCount = new HashMap<>();
        for(int num : nums){
            if(elementCount.containsKey(num)){
                return true;
            }else{
                elementCount.put(num,1);
            }
        }
        return false;
    }
}