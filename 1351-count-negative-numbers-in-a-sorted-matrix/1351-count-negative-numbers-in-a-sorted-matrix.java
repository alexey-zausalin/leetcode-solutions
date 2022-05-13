class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            count += countNegatives(grid[i]);
        }
        
        return count;
    }
    
    private int countNegatives(int[] row) {
        int lo = 0, mid = 0, hi = row.length;
        while (lo < row.length && lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if (row[mid] >= 0) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return row.length - lo;
    }
}