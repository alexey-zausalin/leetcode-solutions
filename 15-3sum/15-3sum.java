class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int k = searchNum(nums, - nums[i] - nums[j], j + 1);
                if (k > j) {
                    set.add(List.of(nums[i], nums[j], nums[k]));
                }
            }
        }

        return new ArrayList(set);
    }
    
    private int searchNum(int[] nums, int target, int lo) {
        int hi = nums.length - 1;
        while (lo <= hi) {
            int med = lo + (hi - lo) / 2;
            if (nums[med] == target) {
                return med;
            }
            
            if (nums[med] < target) {
                lo = med + 1;
            } else {
                hi = med - 1;
            }
        }
        
        return -1;
    }
}