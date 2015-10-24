package solution;

class Solution {
    /**
     * @param x: An integer
     * @return: The sqrt of x
     */
    public int sqrt(int x) {
        // write your code here
        if (x <= 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        long start = 1;
        long end = x / 2;
        while (start < end - 1) {
            long mid = start + (end - start) / 2;
            System.out.println(start + " "+ mid + " " + end);
            if (mid * mid < x) {
                start = mid;
            } else if (mid * mid > x) {
                end = mid;
            } else {
                return (int)mid;
            }
        }
        if (x < start * start) {
            return (int)start - 1;
        } else if (x < end * end) {
            return (int)start;
        } else {
            return (int)end;
        }
    }
}
