class Solution {
    public String toLowerCase(String s) {
        int shift = 'a' - 'A';

        StringBuilder sb = new StringBuilder();
        for (char ch: s.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                sb.append((char)(ch + shift));
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}