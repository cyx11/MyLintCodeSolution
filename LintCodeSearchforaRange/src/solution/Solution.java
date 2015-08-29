package solution;

import java.util.ArrayList;

public class Solution {
	/** 
     *@param A : an integer sorted array
     *@param target :  an integer to be inserted
     *return : a list of length 2, [index1, index2]
     */
    public ArrayList<Integer> searchRange(ArrayList<Integer> A, int target) {
        // write your code here
    	// write your code here
        ArrayList<Integer> rst = new ArrayList<Integer>();
    	if (A == null || A.size() == 0) {
    		rst.add(-1);
    		rst.add(-1);
    		return rst;
    	}
    	int start = 0;
    	int end = A.size() - 1;
    	// find the first target
    	while (start < end - 1) {
    		int mid = start + (end - start) / 2;
    		if (A.get(mid) == target) {
    			end = mid;
    		} else if (A.get(mid) < target) {
    			start = mid;
    		} else {
    			end = mid;
    		}
    	}
    	if (A.get(start) == target) {
    		rst.add(start);
    	} else if (A.get(end) == target) {
    		rst.add(end);
    	} else {
    	    rst.add(-1);
    	}
    	// find the last target
    	start = 0;
    	end = A.size() - 1;
    	while (start < end - 1) {
    		int mid = start + (end - start) / 2;
    		if (A.get(mid) == target) {
    			start = mid;
    		} else if (A.get(mid) < target) {
    			start = mid;
    		} else {
    			end = mid;
    		}
    	}
    	if (A.get(end) == target) {
    		rst.add(end);
    	} else if (A.get(start) == target) {
    		rst.add(start);
    	} else {
    	    rst.add(-1);
    	}
    	return rst;
    }
}
