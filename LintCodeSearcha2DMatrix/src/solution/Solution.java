package solution;

public class Solution {
	/**
     * @param matrix, a list of lists of integers
     * @param target, an integer
     * @return a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        if (matrix == null || matrix.length == 0) {
        	return false;
        }
        if (matrix[0] == null || matrix[0].length == 0) {
        	return false;
        }
        int row = matrix.length;
        int column = matrix[0].length;
        int start = 0;
        int end = row * column - 1;
        while (start < end - 1) {
        	int mid = start + (end - start) / 2;
        	int num = matrix[mid / column][mid % column];
        	if (num == target){
        		return true;
        	} else if (num < target) {
        		start = mid;
        	} else {
        		end = mid;
        	}
        }
        if (matrix[start / column][start % column] == target){
        	return true;
        } else if (matrix[end / column][end % column] == target){
        	return true;
        }
        return false;
    }
    
    public boolean searchMatrix2(int[][] matrix, int target) {
    	// write your code here
    	if (matrix == null || matrix.length == 0) {
        	return false;
        }
        if (matrix[0] == null || matrix[0].length == 0) {
        	return false;
        }
        int start = 0;
        int end = matrix.length - 1;
        while (start < end - 1) {
        	int mid = start + (end - start) / 2;
        	if (target == matrix[mid][0]) {
        		return true;
        	} else if (target <= matrix[mid][0]) {
        		end = mid;
        	} else {
        		start = mid;
        	}
        }
        int row = 0;
        if (matrix[end][0] <= target) {
            row = end;
        } else if (matrix[start][0] <= target) {
            row = start;
        } else {
            return false;
        }
        start = 0;
        end = matrix[0].length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (matrix[row][mid] == target) {
                return true;
            } else if (matrix[row][mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (matrix[row][start] == target) {
            return true;
        } else if (matrix[row][end] == target) {
            return true;
        }
        return false;
    }
}