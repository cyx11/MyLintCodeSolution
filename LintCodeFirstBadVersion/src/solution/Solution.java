package solution;

public class Solution {
	/**
     * @param n: An integers.
     * @return: An integer which is the first bad version.
     */
    public int findFirstBadVersion(int n) {
        // write your code here
        int start = 1;
        int end = n;
        while (start < end - 1) {
            int mid = start + (end - start) / 2;
            if ( VersionControl.isBadVersion(mid) == true ) {
                end = mid;
            } else {
                start = mid;
            }
        }
        if ( VersionControl.isBadVersion(start) == true ) {
            return start;
        } else {
            return end;
        }
    }
}
