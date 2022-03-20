class Solution {
    public int maximumWealth(int[][] accounts) {
        return Arrays.stream(accounts)
            .mapToInt(account -> Arrays.stream(account).sum())
            .max().orElse(0);
    }
}