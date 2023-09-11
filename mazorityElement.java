/*
 * 169. Majority Element
Easy
16.8K
487
Companies
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 
 */

public class mazorityElement {
    public int majorityElement(int[] nums) {
        int maz = nums[0];
        int count = 0;
  
        for(int i=0; i<nums.length;i++){
            if(nums[i] == maz){
                count++;
            }else{
                count--;
        if(count == 0){
            maz = nums[i];
            count = 1;
         }
        }
      }
      return maz;
   
}
