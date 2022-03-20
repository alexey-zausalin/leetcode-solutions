class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        for (int i = 0, j = 0; i < n; i++, j += 2) {
            result[j] = nums[i];
            result[j+1] = nums[i+n];
        }

        return result;
    }
}