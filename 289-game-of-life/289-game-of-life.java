class Solution {
    public void gameOfLife(int[][] board) {
        int rows = board.length, cols = board[0].length;
        
        int[][] nextStateBoard = new int[rows][];
        for (int i = 0; i < rows; i++) {
            nextStateBoard[i] = new int[cols]; 
            for (int j = 0; j < cols; j++) {
                nextStateBoard[i][j] = newState(board, i, j);
            }
        }
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = nextStateBoard[i][j];
            }
        }
    }
    
    private int newState(int[][] board, int row, int col) {
        int neighbors = 0;
        
        if (row > 0) {
            int topMiddle = board[row - 1][col];
            neighbors += topMiddle;
        }
    
        if (row < board.length - 1) {      
            int bottomMiddle = board[row + 1][col];
            neighbors += bottomMiddle;
        }
        
        if (col > 0) {
            if (row > 0) {
                int topLeft = board[row - 1][col - 1];
                neighbors += topLeft;
            }
            
            int middleLeft = board[row][col - 1];
            neighbors += middleLeft;
            
            if (row < board.length - 1) {
                int bottomLeft = board[row + 1][col - 1];
                neighbors += bottomLeft;
            }
        }
                
        if (col < board[0].length - 1) {
            if (row > 0) {
                int topRight = board[row - 1][col + 1];
                neighbors += topRight;
            }

            int middleRight = board[row][col + 1];
            neighbors += middleRight;
            
            if (row < board.length - 1) {
                int bottomRight = board[row + 1][col + 1];
                neighbors += bottomRight;
            }
        }

        if (board[row][col] == 0) {
            if (neighbors == 3) {
                return 1;
            }
            
            return 0;
        }
        
        if (neighbors < 2 || neighbors > 3) {
            return 0;
        }
        
        return 1;
    }
}