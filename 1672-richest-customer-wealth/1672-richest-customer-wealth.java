class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] wealth: accounts) {
            int currentWealth = totalWealth(wealth);
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