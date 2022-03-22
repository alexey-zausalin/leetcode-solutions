class Solution {
    public int minPartitions(String n) {
        char maxNumber = '0';
        for (int i = 0; i < n.length() && maxNumber < '9'; i++) {
            char currentNumber = n.charAt(i);
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
        }

        return Character.getNumericValue(maxNumber);
    }
}