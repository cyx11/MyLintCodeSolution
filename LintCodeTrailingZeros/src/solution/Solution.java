package solution;

public class Solution {
	/*
     * @param n: As description
     * return: An integer, denote the number of trailing zeros in n!
     */
    public long trailingZeros(long n) {
        // write your code here
        if (n == 0) {
            return 0;
        }
        long num2 = 0;
        long num5 = 0;
        for (long i = 1; i <= n; i++) {
        	System.out.println("i: "+ i);
            long temp = i;
            while (temp % 2 == 0) {
                num2++;
                temp = temp / 2;
                System.out.println("temp: "+ temp);
            }
            while (temp % 5 == 0) {
                num5++;
                temp = temp / 5;
                System.out.println("temp: "+ temp);
            }
        }
        return Math.min(num2, num5);
    }
}
