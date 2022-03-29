class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = switch (ruleKey) {
            case "type" -> 0;
            case "color" -> 1;
            case "name" -> 2;
            default -> 0;
        };
        
        int matches = 0;
        for (List<String> item: items) {
            if (item.get(index).equals(ruleValue)) {
                matches++;
            }
        }

        return matches;
    }
}