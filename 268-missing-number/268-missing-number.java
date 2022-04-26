class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int mid = 0, lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            
            if (nums[mid] <= mid) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        
        if (nums[mid] == mid) {
            return mid + 1;
        }

        return mid;
    }
}