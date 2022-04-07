class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        
        List<Integer> indices = new ArrayList();
        
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            int med = lo + (hi - lo) / 2;
            if (nums[med] == target) {
                while (med > 0 && nums[med-1] == target) {
                    med--;
                }
                
                while (med < nums.length && nums[med] == target) {
                    indices.add(med++);
                }
                
                break;
            }
            
            if (nums[med] < target) {
                lo = med + 1;
            } else {
                hi = med - 1;
            }
        }
        
        return indices;
    }
}