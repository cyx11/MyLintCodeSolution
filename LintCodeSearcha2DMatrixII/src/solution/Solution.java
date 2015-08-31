package solution;

public class Solution {
	/**
     * @param matrix: A list of lists of integers
     * @param: A number you want to search in the matrix
     * @return: An integer indicate the occurrence of target in the given matrix
     */
    public int searchMatrix(int[][] matrix, int target) {
        // write your code here
    	if (matrix == null || matrix.length == 0) {
    		return 0;
    	}
    	if (matrix[0] == null || matrix[0].length == 0) {
    		return 0;
    	}
    	int row = matrix.length;
    	int col = matrix[0].length;
    	int rowpos = row - 1;
    	int colpos = 0;
    	int count = 0;
    	while(colpos <= col - 1 && rowpos >= 0) {
    		if(matrix[rowpos][colpos] == target){
    			count++;
    			colpos++;
    		} else if (matrix[rowpos][colpos] > target) {
    			rowpos--;
    		} else {
    			colpos++;
    		}
    	}
    	return count;
    }
}
