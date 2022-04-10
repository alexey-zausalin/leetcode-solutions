class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (String operation: ops) {
            if (operation.equals("+")) {
                stack.push(stack.get(stack.size() - 2) + stack.peek());
            } else if (operation.equals("C")) {
                stack.pop();
            } else if (operation.equals("D")) {
                 stack.push(2 * stack.peek());
            } else {
                stack.push(Integer.valueOf(operation));
            }
        }
        
        int sum = 0;
        for (int score: stack) {
            sum += score;
        }

        return sum;
    }
}