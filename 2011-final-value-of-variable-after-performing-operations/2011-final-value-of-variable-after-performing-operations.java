class Solution {
    public int finalValueAfterOperations(String[] operations) {
        Set<String> increment = Set.of("++X", "X++");
        Set<String> decrement = Set.of("--X", "X--");

        int result = 0;
        for (String operation: operations) {
            if (increment.contains(operation)) {
                result++;
            } else if (decrement.contains(operation)) {
                result--;
            }
        }

        return result;
    }
}