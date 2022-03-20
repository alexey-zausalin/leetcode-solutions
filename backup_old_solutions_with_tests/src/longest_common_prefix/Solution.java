package longest_common_prefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }

        int minLength = minLength(strs);
        for (int i = 0; i < minLength; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j-1].charAt(i) != strs[j].charAt(i)) {
                    return strs[j-1].substring(0, i);
                }
            }
        }

        return strs[0].substring(0, minLength);
    }

    private int minLength(String[] strs) {
        if (strs.length == 0) {
            return 0;
        }

        int minLength = strs[0].length();
        for (String str: strs) {
            if (minLength > str.length()) {
                minLength = str.length();
            }
        }

        return minLength;
    }
}
