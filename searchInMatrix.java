/*
 * 240. Search a 2D Matrix II
Medium
11.2K
184
Companies
Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.
 

Example 1:


Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
Output: true
Example 2:


Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 20
Output: false
 */

class Solution {
    public boolean searchMatrix(int[][] ar, int target) {
        int i = 0, j = ar[0].length - 1;

        while (i < ar.length && j >= 0) {
            if (ar[i][j] == target) {
                return true;
            } else if (target < ar[i][j]) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}