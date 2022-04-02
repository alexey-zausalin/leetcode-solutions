class Solution {
    public boolean validPalindrome(String s) {
        int lo = 0, hi = s.length() - 1;
        while (lo <= hi) {
            if (s.charAt(lo) != s.charAt(hi)) {
                return isAbsolutePalindrome(s.substring(lo, hi)) || isAbsolutePalindrome(s.substring(lo+1, hi+1));
            }

            lo++;
            hi--;
        }

        return true;
    }
    
    private boolean isAbsolutePalindrome(String s) {
        int lo = 0, hi = s.length() - 1;
        while (lo <= hi) {
            if (s.charAt(lo++) != s.charAt(hi--)) {
                return false;
            }
        }

        return true;
    }
}