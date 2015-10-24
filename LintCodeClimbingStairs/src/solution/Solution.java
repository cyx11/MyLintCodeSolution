package solution;

public class Solution {
	/**
     * @param n: An integer
     * @return: An integer
     */
    public int climbStairs(int n) {
        // write your code here
        if (n <= 1) {
            return n;
        }
        int last = 1;
        int lastlast = 1;
        int temp = 0;
        for (int i = 2; i <= n; i++) {
            temp = last + lastlast;
            lastlast= last;
            last = temp;
        }
        return temp;
    }
}
