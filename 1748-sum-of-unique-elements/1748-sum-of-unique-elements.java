class Solution {
    public int sumOfUnique(int[] nums) {
        Arrays.sort(nums);

        int sum = 0;
        int lastNum = 0, count = 0;
        for (Integer num: nums) {
            if (num == lastNum) {
                count++;
                continue;
            }

            if (count == 1) {
                sum += lastNum;
            }

            lastNum = num;
            count = 1;
        }

        if (count == 1) {
            sum += lastNum;
        }
        
        return sum;
    }
    
    public int sumOfUniqueWithHash(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        for (Integer num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                sum += entry.getKey();
            }
        }
        
        return sum;
    }
}