package running_sum_of_1d_array;

import java.util.Arrays;

public class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = Arrays.copyOf(nums, nums.length);
        for (int i = 1; i < nums.length; i++) {
            result[i] += result[i-1];
        }

        return result;
    }
}
