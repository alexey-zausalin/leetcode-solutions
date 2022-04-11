class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> list = new ArrayList<>();

        int rows = grid.length, cols = grid[0].length;
        
        int size = rows * cols;
        k = size - (k % size);

        for (int row = 0; row < rows; row++) {
            List<Integer> sublist = new ArrayList<>();
            for (int col = 0; col < cols; col++) {
                int newCol = (col + k) % cols;
                int newRow = (row + (col + k) / cols) % rows;

                sublist.add(grid[newRow][newCol]);
            }
            
            list.add(sublist);
        }
        
        return list;
    }
}