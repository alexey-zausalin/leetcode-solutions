class Solution {
    public String sortSentence(String s) {
        String[] words = s.split("\s");
        for (int i = 0; i < words.length; i++) {
            for (int j = i; j > 0; j--) {
                if (index(words[j]) >= index(words[j-1])) {
                    break;
                }

                String swap = words[j-1];
                words[j-1] = words[j];
                words[j] = swap;
            }
        }

        for (int i = 0; i < words.length; i++) {
            words[i] = pureWord(words[i]);
        }
        
        return String.join(" ", words);
    }
    
    private int index(String word) {
        return word.charAt(word.length()-1);
    }
    
    private String pureWord(String word) {
        return word.substring(0, word.length() - 1);
    }
}