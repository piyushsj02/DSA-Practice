// LeetCode-79

class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        int index = 0;
        // Iterate through each cell in the board
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Check if the current cell matches the first character of the word
                if (board[i][j] == word.charAt(index)) {
                    // Call the searchNext method to explore possibilities
                    if (searchNext(board, word, i, j, index, m, n))
                        return true;
                }
            }
        }
        return false;
    }

    private boolean searchNext(char[][] board, String word, int row, int col,
            int index, int m, int n) {
        // Check if the entire word is formed
        if (index == word.length())
            return true;
        // Check if the current cell is out of bounds or has been visited
        // or if the character in the cell does not match the current character of
        // the word
        if (row < 0 || col < 0 || row == m || col == n || board[row][col] != word.charAt(index)
                || board[row][col] == '!')
            return false;
        char c = board[row][col];
        board[row][col] = '!'; // Mark the cell as visited
        // Recursively explore in four directions
        boolean top = searchNext(board, word, row - 1, col, index + 1, m, n);
        boolean right = searchNext(board, word, row, col + 1, index + 1, m, n);
        boolean bottom = searchNext(board, word, row + 1, col, index + 1, m, n);
        boolean left = searchNext(board, word, row, col - 1, index + 1, m, n);
        board[row][col] = c; // Backtrack by restoring the original character in the
        // cell
        return top || right || bottom || left;
    }
}