class Solution {
    private static final String[] alphabet = new String[]{
        ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
    };

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> transformations = new HashSet<>();
        for (String word: words) {
            transformations.add(transformWord(word));
        }
        
        return transformations.size();
    }
    
    private String transformWord(String word) {
        StringBuilder sb = new StringBuilder();
        for (char letter: word.toCharArray()) {
            sb.append(alphabet[letter - 'a']);
        }
        
        return sb.toString();
    }
}