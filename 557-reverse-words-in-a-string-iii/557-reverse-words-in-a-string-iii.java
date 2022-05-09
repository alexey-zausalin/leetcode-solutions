class Solution {
    public String reverseWords(String s) {
        Stack<String> words = new Stack();
                  
        StringBuffer word = new StringBuffer();
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                word.append(ch);
                continue;
            }
                     
            words.add(word.toString());
            word.setLength(0);
        }
        
        StringBuffer sb = new StringBuffer(word.toString());
        while (!words.isEmpty()) {
            if (!sb.isEmpty()) {
                sb.append(' ');
            }
            sb.append(words.pop());
        }
        
        return sb.toString();
    }
}