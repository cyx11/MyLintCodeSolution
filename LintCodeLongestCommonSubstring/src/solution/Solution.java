package solution;

public class Solution {
	/**
     * @param A, B: Two string.
     * @return: the length of the longest common substring.
     */
    public int longestCommonSubstring(String A, String B) {
        // write your code here
        if (A == null || B == null || A.length() == 0 || B.length() == 0) {
            return 0;
        }
        int lenA = A.length();
        int lenB = B.length();
        int[][] len = new int [lenA + 1][lenB + 1];
        for (int i = 0; i <= lenA; i++) {
            len[i][0] = 0;
        }
        for (int j = 0; j <= lenB; j++) {
            len[0][j] = 0;
        }
        for (int i = 1; i <= lenA; i++) {
            for (int j = 1; j <= lenB; j++) {
                    len[i][j] = (A.charAt(i - 1) == B.charAt(j - 1)) ? len[i - 1][j - 1] + 1 : 0;
            }
        }
        int longest = 0;
        for (int i = 0; i <= lenA; i++) {
            for (int j = 0; j<=lenB; j++) {
                longest = Math.max(longest, len[i][j]);
            }
        }
        return longest;
    }
}
