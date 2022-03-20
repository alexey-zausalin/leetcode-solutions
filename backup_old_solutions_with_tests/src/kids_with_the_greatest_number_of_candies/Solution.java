package kids_with_the_greatest_number_of_candies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandiesUsingRawJava(int[] candies, int extraCandies) {
        int maxCandies = 0;
        for (int kidsCandies: candies) {
            if (kidsCandies > maxCandies) {
                maxCandies = kidsCandies;
            }
        }

        maxCandies -= extraCandies;

        List<Boolean> result = new ArrayList<>(candies.length);
        for (int kidsCandies: candies) {
            result.add(kidsCandies >= maxCandies);
        }

        return result;
    }

    public List<Boolean> kidsWithCandiesUsingStream(int[] candies, int extraCandies) {
        int maxCandies = Arrays.stream(candies).max().getAsInt() - extraCandies;

        return Arrays.stream(candies)
                .mapToObj(item -> item >= maxCandies)
                .toList();
    }
}
