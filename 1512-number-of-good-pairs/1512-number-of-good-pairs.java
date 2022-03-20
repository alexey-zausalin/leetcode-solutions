class Solution {
    public int numIdenticalPairs(int[] nums) {
        int countPairs = 0;

        Map<Integer, Integer> pairs = new HashMap<>();
        for (int num : nums) {
            int numCount = pairs.getOrDefault(num, 0);
            countPairs += numCount;
            pairs.put(num, numCount + 1);
        }

        return countPairs;
    }
}