class Solution {

    //Hash Map
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> numsMap = new HashMap();
        for (int num: nums) {
            count += numsMap.getOrDefault(num + k, 0);
            count += numsMap.getOrDefault(num - k, 0);

            numsMap.put(num, numsMap.getOrDefault(num, 0) + 1);
        }

        return count;
    }

    //Brute force
    public int countKDifferenceBruteForce(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int absSum = Math.abs(nums[i] - nums[j]);
                if (absSum == k) {
                    count++;
                }
            }
        }
        
        return count;
    }
}