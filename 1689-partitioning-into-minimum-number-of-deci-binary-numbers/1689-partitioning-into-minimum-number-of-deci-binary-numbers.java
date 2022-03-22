class Solution {
    public int minPartitions(String n) {
        Integer maxNumber = 0;
        for (int i = 0; i < n.length() && maxNumber < 9; i++) {
            Integer currentNumber = Character.getNumericValue(n.charAt(i));
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
        }
        
        return maxNumber;
    }
}