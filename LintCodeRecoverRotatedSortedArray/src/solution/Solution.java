package solution;

import java.util.ArrayList;

public class Solution {
    /**
     * @param nums: The rotated sorted array
     * @return: void
     */
    public void recoverRotatedSortedArray(ArrayList<Integer> nums) {
        // write your code
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) > nums.get(i+1)) {
                reverse(nums, 0, i);
                reverse(nums, i+1, nums.size()-1);
                reverse(nums, 0, nums.size()-1);
                return;
            }
        }
    }
    
    private void reverse(ArrayList<Integer> nums, int left, int right) {
        while (left < right) {
            int temp = nums.get(left);
            nums.set(left, nums.get(right));
            nums.set(right, temp);
            left++;
            right--;
        }
    }
}
