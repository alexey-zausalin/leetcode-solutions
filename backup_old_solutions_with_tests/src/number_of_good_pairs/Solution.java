package number_of_good_pairs;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     1 - 0
     2 - 1      1,1         1
     3 - 3      1,1,1       1 + 2
     4 - 6      1,1,1,1     1 + 2 + 3
     5 - 10     1,1,1,1,1   1 + 2 + 3 + 4
     */
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
