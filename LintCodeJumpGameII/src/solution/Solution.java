package solution;

public class Solution {
	/**
     * @param A: A list of lists of integers
     * @return: An integer
     */
    public int jump(int[] A) {
        // write your code here
        if (A == null || A.length == 0) {
            return 0;
        }
        
        int length = A.length;
        int[] minJump = new int[length];
        minJump[0] = 0;
        for (int i = 1; i < length; i++) {
            minJump[i] = Integer.MAX_VALUE;
        }
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if ( A[j] != Integer.MAX_VALUE && A[j] >= i - j && minJump[j] + 1 < minJump[i]) {
                    minJump[i] = minJump[j] + 1;
                }
            }
        }
        return minJump[length - 1];
    }
}
