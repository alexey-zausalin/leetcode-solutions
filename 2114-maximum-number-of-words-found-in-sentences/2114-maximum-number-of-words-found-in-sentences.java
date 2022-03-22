class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxCount = 0;
        for (String sentence: sentences) {
            int currentCount = numberWords(sentence);
            if (currentCount > maxCount) {
                maxCount = currentCount;
            }
        }
        
        return maxCount;
    }
    
    private int numberWords(String sentence) {
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                count++;
            }
        }
        
        return count + 1;
    }
}