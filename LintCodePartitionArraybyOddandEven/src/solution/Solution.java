package solution;

public class Solution {
	
	/**
     * @param nums: an array of integers
     * @return: nothing
     */
    public void partitionArray(int[] nums) {
        // write your code here;
        if (nums == null || nums.length == 0) {
            return;
        }
        int i = 0, j = nums.length - 1;
        while (i < j) {
            while ((nums[i] % 2 == 1) && (i < j)) {
            	System.out.println("i = "+ i);
                i++;
            }
            while ((nums[i] % 2 == 0) && (i < j)) {
            	System.out.println("j = "+ j);
                j--;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

}
