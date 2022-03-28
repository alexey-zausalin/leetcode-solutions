class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        for (;num > 0; steps++) {
            if (num % 2 != 0) {
                num -= 1;
            } else {
                num /= 2;
            }
        }
        
        return steps;
    }
}