class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        
        List<Integer> indices = new ArrayList();
        
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            int med = lo + (hi - lo) / 2;
            if (nums[med] == target) {
                int min = minIndex(nums, target, med);
                int max = maxIndex(nums, target, med);
                for (int i = min; i <= max; i++) {
                    indices.add(i);
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
    
    private int minIndex(int[] nums, int target, int index) {
        while (index > 0 && nums[index-1] == target) {
            index--;
        }
        
        return index;
    }
    
    private int maxIndex(int[] nums, int target, int index) {
        while (index < (nums.length - 1) && nums[index+1] == target) {
            index++;
        }
        
        return index;
    }
}