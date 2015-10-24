package solution;

public class Solution {
    /**
     * @param A: A list of integers
     * @return: The boolean answer
     */
    public boolean canJump(int[] A) {
        // wirte your code here
        int length = A.length;
        boolean[] reach = new boolean[length];
        reach[0] = true;
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i - 1; j++) {
                if (reach[j] && A[j] >= i - j) {
                    reach[i] = true;
                    break;
                }
            }
        }
        return reach[length - 1];
    }
}
