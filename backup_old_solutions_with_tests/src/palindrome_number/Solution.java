package palindrome_number;

public class Solution {
    public boolean isPalindromeDangerousOverflow(int x) {
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

    public boolean isPalindromeSafeOverflow(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reverted = 0;
        while (x > reverted) {
            reverted *= 10;
            reverted += x % 10;
            x /= 10;
        }

        return x == reverted || x == reverted / 10;
    }
}
