package solution;

public class Solution {
	/**
     * @param num: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] num) {
        // write your code here
    	int start = 0;
    	int end = num.length - 1;
    	while (start < end - 1) {
    		int mid = start + ( end - start ) / 2;
    		if (num[mid] >= num[end]) {
    			start = mid;
    		} else {
    			end = mid;
    		}
    	}
    	if (num[start] < num[end]) {
    		return num[start];
    	} else {
    		return num[end];
    	}
    }
}
