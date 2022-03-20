class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (hm.containsKey(num)) {
                return new int[]{hm.get(num), i};
            }

            hm.put(target - num, i);
        }

        return new int[]{0, 1};
    }
}