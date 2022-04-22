class Solution {
    public void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j > 0 && nums[j] < nums[j-1]; j--) {
                int swap = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = swap;
            }
        }
    }
}