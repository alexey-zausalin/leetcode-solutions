package richest_customer_wealth;

import java.util.Arrays;

public class Solution {
    public int maximumWealthUsingStreams(int[][] accounts) {
        int maxWealth = 0;
        for (int[] account: accounts) {
            maxWealth = Math.max(maxWealth, Arrays.stream(account).sum());
        }

        return maxWealth;
    }

    public int maximumWealthUsingStreamsV2(int[][] accounts) {
        return Arrays.stream(accounts)
                .mapToInt(account -> Arrays.stream(account).sum())
                .max().orElse(0);
    }

    public int maximumWealthUsingRawJava(int[][] accounts) {
        int maxWealth = 0;
        for (int[] account: accounts) {
            int currentWealth = totalWealth(account);
            if (currentWealth > maxWealth) {
                maxWealth = currentWealth;
            }
        }

        return maxWealth;
    }

    private int totalWealth(int[] wealth) {
        int total = 0;
        for (int currentWealth: wealth) {
            total += currentWealth;
        }

        return total;
    }
}
