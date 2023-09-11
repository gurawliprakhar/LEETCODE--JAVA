/*
118. Pascal's Triangle
Easy
11.8K
372
Companies
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:




Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]

*/

import java.util.ArrayList;
import java.util.List;

public class Pascaltrinagle {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0)
            return new ArrayList<>();

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    row.add(1);
                } else {
                    row.add(res.get(i - 2).get(j) + res.get(i - 2).get(j - 1));
                }
            }
            res.add(row);
        }
        return res;
    }
}
