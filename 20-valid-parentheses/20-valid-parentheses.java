class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> allowedBracketsPairs = new HashMap<>() {{
            put(')', '(');
            put('}', '{');
            put(']', '[');
        }};

        Stack<Character> stackBrackets = new Stack<>();
        for (char bracket: s.toCharArray()) {
            if (!allowedBracketsPairs.containsKey(bracket)) {
                stackBrackets.push(bracket);
                continue;
            }

            if (stackBrackets.isEmpty() || stackBrackets.pop() != allowedBracketsPairs.get(bracket)) {
                return false;
            }
        }
        
        return stackBrackets.isEmpty();
    }
}