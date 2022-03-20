class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = Arrays.stream(candies).max().getAsInt() - extraCandies;

        return Arrays.stream(candies)
            .mapToObj(item -> item >= maxCandies)
            .toList();
    }
}