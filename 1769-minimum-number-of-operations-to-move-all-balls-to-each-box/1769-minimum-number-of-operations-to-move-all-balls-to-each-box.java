class Solution {
    public int[] minOperations(String boxes) {
        boolean[] positions = new boolean[boxes.length()];
        for (int i = 0; i < boxes.length(); i++) {
            positions[i] = boxes.charAt(i) == '1';
        }
        
        int[] operations = new int[boxes.length()];
        for (int i = 0; i < positions.length; i++) {
            for (int j = 0; j < positions.length; j++) {
                if (i == j || !positions[j]) {
                    continue;
                }
                
                operations[i] += Math.abs(i - j);
            }
        }
        
        return operations;
    }
}