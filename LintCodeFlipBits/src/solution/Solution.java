package solution;

public class Solution {
	/**
     *@param a, b: Two integer
     *return: An integer
     */
    public int bitSwapRequired(int a, int b) {
        // write your code here
        int num = 0;
        while (a != 0 || b != 0) {
        	System.out.println(a+" "+b);
            if (a % 2 == b % 2 || a%2 == -b%2) {
            } else {
                num++;
            }
            a = a >>> 1;
            b = b >>> 1;
        }
        return num;
    }
}
