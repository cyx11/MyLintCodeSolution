package solution;

public class Solution {
	/**
     * @param s a string
     * @return an integer
     */
    public int minCut(String s) {
        // write your code here
        if (s == null || s.length() == 0) {
            return 0;
        }

        // preparation
        boolean[][] isPalindrome = getIsPalindrome(s);
        
        // initialize
        int[] f = new int[s.length() + 1];
        for (int i = 0; i <= s.length(); i++) {
            f[i] = i - 1;
        }
        
        // main
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (isPalindrome[j][i - 1]) {
                    f[i] = Math.min(f[i], f[j] + 1);
                }
            }
        }

        return f[s.length()];
    }
    
    private boolean[][] getIsPalindrome(String s) {
        int length = s.length();
        boolean[][] isPalindrome = new boolean[length][length];
        for (int i = 0; i < length; i++) {
            isPalindrome[i][i] = true;
        }
        for (int i = 0; i < length - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                isPalindrome[i][i + 1] = true;
            } else {
                isPalindrome[i][i + 1] = false;
            }
        }
        for (int len = 2; len < length; len++) {
            for (int start = 0; start + len < length; start++) {
                if (s.charAt(start) == s.charAt(start + len) && isPalindrome[start+1][start + len - 1]) {
                    isPalindrome[start][start + len] = true;
                } else {
                    isPalindrome[start][start + len] = false;
                }
            }
        }
        return isPalindrome;
    }
    
    private boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
