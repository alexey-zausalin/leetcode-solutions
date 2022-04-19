class Solution {
    public int maxProduct(int[] nums) {
        int result = 1;
        for (int i = 0; i < 2; i++) {
            int max = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] > nums[max]) {
                    max = j;
                }
            }
        
            int swap = nums[max];
            nums[max] = nums[i];
            nums[i] = swap;
            
            result *= nums[i] - 1;
        }
        
        return result;
    }
}