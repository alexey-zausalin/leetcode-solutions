class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stackS = stringToStack(s);
        Stack<Character> stackT = stringToStack(t);
        
        return stackS.equals(stackT);
    }
    
    private Stack<Character> stringToStack(String s) {
        Character backspace = '#';
        Stack<Character> stack = new Stack();
        for (Character ch : s.toCharArray()) {
            if (!backspace.equals(ch)) {
                stack.push(ch);
                continue;
            }

            if (!stack.isEmpty()) {
                stack.pop();
            }
        }

        return stack;
    }
}