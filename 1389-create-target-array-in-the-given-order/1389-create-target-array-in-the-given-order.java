class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> listNums = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            listNums.add(index[i], nums[i]);
        }
        
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            target[i] = listNums.get(i);
        }
        
        return target;
    }
    
    public int[] createTargetArrayDoubleLoops(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int curIndex = index[i];
            
            int prev = target[curIndex];
            for (int j = curIndex + 1; j < nums.length; j++) {
                int cur = target[j];
                target[j] = prev;
                prev = cur;
            }
            
            target[curIndex] = nums[i];
        }
        
        return target;
    }
}