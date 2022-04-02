class Solution {
    public boolean validPalindrome(String s) {
        int lo = 0, hi = s.length() - 1;
        while (lo <= hi) {
            if (s.charAt(lo) != s.charAt(hi)) {
                if (
                    absoluteValidPalindrome(s.substring(lo, hi)) ||
                    absoluteValidPalindrome(s.substring(lo+1, hi+1))
                ) {
                    return true;
                }

                return false;
            }

            lo++;
            hi--;
        }

        return true;
    }
    
    private boolean absoluteValidPalindrome(String s) {
        int lo = 0, hi = s.length() - 1;
        while (lo <= hi) {
            if (s.charAt(lo++) != s.charAt(hi--)) {
                return false;
            }
        }

        return true;
    }
}