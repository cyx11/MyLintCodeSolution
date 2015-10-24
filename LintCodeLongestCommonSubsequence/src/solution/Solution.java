package solution;

public class Solution {
	/**
     * @param A, B: Two strings.
     * @return: The length of longest common subsequence of A and B.
     */
    public int longestCommonSubsequence(String A, String B) {
        // write your code here
        if (A == null || B == null || A.length() == 0 || B.length() == 0) {
            return 0;
        }
        int lenA = A.length();
        int lenB = B.length();
        int[][] len = new int[lenA + 1][lenB + 1];
        for (int i = 0; i < lenA + 1; i++) {
            len[i][0] = 0;
        }
        for (int j = 0; j < lenB + 1; j++) {
            len[0][j] = 0;
        }
        for (int i = 1; i < lenA + 1; i++) {
            for (int j = 1; j < lenB + 1; j++) {
                if (A.charAt(i - 1) == B.charAt(j - 1)) {
                    len[i][j] = len[i - 1][j - 1] + 1;
                } else {
                    len[i][j] = Math.max(len[i - 1][j], len[i][j - 1]);
                }
            }
        }
        return len[lenA][lenB];
    }
}
