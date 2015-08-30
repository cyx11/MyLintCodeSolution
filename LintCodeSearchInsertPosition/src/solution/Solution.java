package solution;

public class Solution {
	/** 
     * param A : an integer sorted array
     * param target :  an integer to be inserted
     * return : an integer
     */
    public int searchInsert(int[] A, int target) {
        // write your code here
    	if (A == null || A.length == 0) {
    		return 0;
    	}
    	int start = 0;
    	int end = A.length - 1;
    	while (start < end - 1) {
    		int mid = start + (end - start) / 2;
    		if (A[mid] == target) {
    			return mid;
    		} else if (A[mid] > target) {
    			end = mid;
    		} else {
    			start = mid;
    		}
    	}
    	if (target <= A[start])
    		return start;
    	if (target <= A[end])
    		return end;
    	return end + 1;
    }
}
