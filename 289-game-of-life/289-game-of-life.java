class Solution {
    public void gameOfLife(int[][] board) {
        int rows = board.length, cols = board[0].length;
        
        int[][] nextStateBoard = new int[rows][];
        for (int i = 0; i < rows; i++) {
            nextStateBoard[i] = new int[cols]; 
            for (int j = 0; j < cols; j++) {
                nextStateBoard[i][j] = isLive(board, i, j) ? 1 : 0;
            }
        }
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = nextStateBoard[i][j];
            }
        }
    }
    
    private boolean isLive(int[][] board, int row, int col) {
        int neighbors = 0;
        
        boolean hasTop = row > 0;
        boolean hasBottom = row < (board.length - 1);
        boolean hasLeft = col > 0;
        boolean hasRight = col < (board[0].length - 1);

        if (hasTop) {
            neighbors += board[row - 1][col];
        }
    
        if (hasBottom) {     
            neighbors += board[row + 1][col];
        }
        
        if (hasLeft) {
            if (hasTop) {
                neighbors += board[row - 1][col - 1];
            }
            
            neighbors += board[row][col - 1];
            
            if (hasBottom) {
                neighbors += board[row + 1][col - 1];
            }
        }
                
        if (hasRight) {
            if (hasTop) {
                neighbors += board[row - 1][col + 1];
            }

            neighbors += board[row][col + 1];
            
            if (hasBottom) {
                neighbors += board[row + 1][col + 1];
            }
        }

        boolean isLive = board[row][col] == 1;
        
        return neighbors == 3 || isLive && neighbors == 2;
    }
}