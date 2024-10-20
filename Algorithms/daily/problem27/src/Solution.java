package Algorithms.daily.problem27.src;

class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0, index = 0;

        while (i < nums.length) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
            i++;

        }
        return index;
    }
}
