class Solution {
    public void rotate(int[] nums, int k) {
        k = nums.length - k % nums.length;
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    void reverse(int[] nums, int from, int to) {
        for (; from < to; from++, to--) {
            int buf = nums[from];
            nums[from] = nums[to];
            nums[to] = buf;
        }
    }
}