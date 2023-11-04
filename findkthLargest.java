/*
 * 215. Kth Largest Element in an Array
Solved
Medium
Topics
Companies
Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

Can you solve it without sorting?

 

Example 1:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
Example 2:

Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
 
 */

class Solution {
    static void heapSort(int[] ar) {
        int n = ar.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(ar, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            int temp = ar[0];
            ar[0] = ar[i];
            ar[i] = temp;
            heapify(ar, i, 0);
        }
    }

    static void heapify(int[] ar, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && ar[left] > ar[largest]) {
            largest = left;
        }
        if (right < n && ar[right] > ar[largest]) {
            largest = right;
        }
        if (largest != i) {
            int swap = ar[i];
            ar[i] = ar[largest];
            ar[largest] = swap;
            heapify(ar, n, largest);
        }
    }

    static int findKthLargest(int[] ar, int k) {
        heapSort(ar);
        return ar[ar.length - k];
    }

}