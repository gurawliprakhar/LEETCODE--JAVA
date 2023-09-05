/*
 * You are given an integer array bloomDay, an integer m and an integer k.

You want to make m bouquets. To make a bouquet, you need to use k adjacent flowers from the garden.

The garden consists of n flowers, the ith flower will bloom in the bloomDay[i] and then can be used in exactly one bouquet.

Return the minimum number of days you need to wait to be able to make m bouquets from the garden. If it is impossible to make m bouquets return -1.

 

Example 1:

Input: bloomDay = [1,10,3,10,2], m = 3, k = 1
Output: 3
Explanation: Let us see what happened in the first three days. x means flower bloomed and _ means flower did not bloom in the garden.
We need 3 bouquets each should contain 1 flower.
After day 1: [x, _, _, _, _]   // we can only make one bouquet.
After day 2: [x, _, _, _, x]   // we can only make two bouquets.
After day 3: [x, _, x, _, x]   // we can make 3 bouquets. The answer is 3.
Example 2:

Input: bloomDay = [1,10,3,10,2], m = 3, k = 2
Output: -1
Explanation: We need 3 bouquets each has 2 flowers, that means we need 6 flowers. We only have 5 flowers so it is impossible to get the needed bouquets and we return -1.
 */

class Solution {
    static boolean isPossibleSol(int[] ar, int boq, int flowers, int m) {
        int adj = 0, bc = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] <= m) {
                adj++;

                if (adj == flowers) {
                    bc++;
                    if (bc == boq) {
                        return true;
                    }
                    adj = 0;
                }
            } else {
                adj = 0;
            }
        }
        return false;
    }

    public int minDays(int[] ar, int boq, int flowers) {
        if (boq * flowers > ar.length) {
            return -1;
        }
        int l = 1, h = (int) 1e9;
        int res = -1;
        while (l <= h) {
            int m = l + (h - l) / 2; // Avoid integer overflow

            if (isPossibleSol(ar, boq, flowers, m)) {
                res = m;
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return res;
    }
}
