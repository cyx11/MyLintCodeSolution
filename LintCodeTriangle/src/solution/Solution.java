package solution;

import java.util.ArrayList;

public class Solution {
	/**
     * @param triangle: a list of lists of integers.
     * @return: An integer, minimum path sum.
     */	
	//Buttom to Upper
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        // write your code here
        if (triangle == null || triangle.size() == 0) {
            return 0;
        }
        int n = triangle.size();
        int[][] sum = new int[n][n];
        for (int i = 0; i < n; i++) {
            sum[n - 1][i] = triangle.get(n - 1).get(i);
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                sum[i][j] = Math.min(sum[i+1][j], sum[i+1][j+1]) + triangle.get(i).get(j);
            }
        }
        return sum[0][0];
    }
    
    /**
     * @param triangle: a list of lists of integers.
     * @return: An integer, minimum path sum.
     */
    //Memorize Search
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        // write your code here
        if (triangle == null || triangle.size() == 0) {
            return 0;
        }
        int n = triangle.size();
        int sum[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum[i][j] = Integer.MAX_VALUE;
            }
        }
        return search(0, 0, triangle, sum);
    }
    
    private int search(int row, int col, ArrayList<ArrayList<Integer>> triangle, int sum[][]) {
        if (row >= triangle.size()) {
            return 0;
        }
        if (sum[row][col] != Integer.MAX_VALUE) {
            return sum[row][col];
        }
        sum[row][col] = Math.min(search(row + 1, col, triangle, sum), search(row + 1, col + 1, triangle, sum)) + triangle.get(row).get(col);
        return sum[row][col];
    }
    
}
