class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) {
            return true;
        }

        int lo = 0, hi = num / 2;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (mid == 0) {
                return false;
            }

            int div = num / mid;
            if (div == mid && num % mid == 0) {
                return true;
            }
            
            if (div > mid) {
                lo = mid + 1;
            } else {
                hi= mid - 1;
            }
        }
        
        return false;
    }
}