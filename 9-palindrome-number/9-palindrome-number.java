class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int straight = x;
        int reverted = 0;

        while (x > 0) {
            reverted *= 10;
            reverted += x % 10;
            x /= 10;
        }

        return straight == reverted;
    }
}