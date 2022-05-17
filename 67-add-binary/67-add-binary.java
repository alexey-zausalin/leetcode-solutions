class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int buffer = 0;
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int val = buffer;
            
            if (i >= 0 && a.charAt(i) == '1') {
                val += 1;
            }
                        
            if (j >= 0 && b.charAt(j) == '1') {
                val += 1;
            }

            sb.append(val % 2);
            buffer = val / 2;
        }

        if (buffer > 0) {
            sb.append(buffer);
        }

        return sb.reverse().toString();
    }
}