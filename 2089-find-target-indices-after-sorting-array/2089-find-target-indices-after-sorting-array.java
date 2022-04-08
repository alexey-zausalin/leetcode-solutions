class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> indices = new ArrayList();
        
        Arrays.sort(nums);
        
        int i = minIndex(nums, target);
        if (i >= 0) {
            for (; i < nums.length && nums[i] == target; i++) {
                indices.add(i);
            }
        }

        return indices;
    }
    
    private int minIndex(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            int med = lo + (hi - lo) / 2;
            if (nums[med] == target) {
                while (med > 0 && nums[med-1] == target) {
                    med--;
                }
                
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