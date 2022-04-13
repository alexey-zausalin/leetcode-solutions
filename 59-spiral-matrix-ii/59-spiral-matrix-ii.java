class Solution {
    private int counter;
    
    private int row;
    private int col;
    
    private int[][] matrix;
    
    public int[][] generateMatrix(int n) {
        init(n);

        int maxCounter = n * n;
        while (counter < maxCounter) {
            moveLeft();
            row++;
            col--;

            moveBottom();
            row--;
            col--;

            moveRight();
            row--;
            col++;

            moveTop();
            row++;
            col++;
        }

        return matrix;
    }
    
    private void init(int n) {
        matrix = new int[n][];
        for (int i = 0; i < n; i++) {
           matrix[i] = new int[n];
        }

        row = 0;
        col = 0;
        counter = 0;
    }
    
    private void moveLeft() {
        while (col < matrix.length) {
            if (matrix[row][col] != 0) {
                return;
            }
            
            matrix[row][col++] = ++counter;
        }
    }
        
    private void moveBottom() {
        while (row < matrix.length) {
            if (matrix[row][col] != 0) {
                return;
            }
            
            matrix[row++][col] = ++counter;
        }
    }
         
    private void moveRight() {
        while (col >= 0) {
            if (matrix[row][col] != 0) {
                return;
            }
            
            matrix[row][col--] = ++counter;
        }
    }
       
    private void moveTop() {
        while (row >= 0) {
            if (matrix[row][col] != 0) {
                return;
            }
            
            matrix[row--][col] = ++counter;
        }
    }
}
