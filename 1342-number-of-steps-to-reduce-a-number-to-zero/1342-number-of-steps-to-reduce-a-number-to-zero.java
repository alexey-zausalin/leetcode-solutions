class Solution {
    public int numberOfSteps(int num) {
        if (num == 0) {
            return 0;
        }

        int steps = 0;
        while (num > 0) {
            steps += (num & 1) + 1;
            num = num >> 1;
        }
        
        return steps - 1;
    }
    
    public int numberOfStepsTrivial(int num) {
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