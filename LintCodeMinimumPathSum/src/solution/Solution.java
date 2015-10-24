package solution;

public class Solution {
	public int minPathSum(int[][] grid) {
        // write your code here
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int[][] minSum = new int[m][n];
        minSum[0][0] = grid[0][0];
        for (int i = 1; i < m; i++) {
            minSum[i][0] = minSum[i-1][0] + grid[i][0];
        }
        for (int j = 1; j < n; j++) {
            minSum[0][j] = minSum[0][j-1] + grid[0][j];
        }
        for (int row = 1; row < m; row++) {
            for (int col = 1; col < n; col ++) {
                minSum[row][col] = Math.min(minSum[row - 1][col], minSum[row][col - 1]) + grid[row][col];
            }
        }
        return minSum[m-1][n-1];
    }
}
