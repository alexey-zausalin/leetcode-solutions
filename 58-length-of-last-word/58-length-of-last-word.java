class Solution {
    public int lengthOfLastWord(String s) {
        int start = -1;
        int end = 0;

        int length = 0;
        for (int i = 0; i < s.length(); i ++) {
            if (s.charAt(i) == ' ') {
                if (end != start) {
                    length = end - start;
                }

                start = i;
            }
            
            end = i;
        }
        
        if (end != start) {
            return end - start;
        }

        return length;
    }
}