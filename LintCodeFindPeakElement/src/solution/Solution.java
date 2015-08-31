package solution;

public class Solution {
	/**
     * @param A: An integers array.
     * @return: return any of peek positions.
     */
    public int findPeak(int[] A) {
        // write your code here
    	int start = 1;
    	int end = A.length - 2;
    	while (start < end - 1) {
    		int mid = start + (end - start) / 2;
    		if ( A[mid] < A[mid - 1]) {
    			end = mid;
    		} else if (A[mid] < A[mid + 1]){
    			start = mid;
    		} else {
    			return mid;
    		}
    	}
    	if(A[start] > A[end]){
    		return start;
    	} else {
    		return end;
    	}
    }
}
