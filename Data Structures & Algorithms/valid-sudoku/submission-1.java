class Solution { //bitmask
    public boolean isValidSudoku(char[][] board) {
        int[] row = new int[9];
        int[] col = new int[9];
        int[] mat = new int[9];

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') continue;
                int b = board[r][c] - '1';
                int m = 3 * (r / 3) + c / 3;
                if ((row[r] & (1 << b)) > 0 || (col[c] & (1 << b)) > 0 || (mat[m] & (1 << b)) > 0) return false;
                row[r] |= 1 << b;
                col[c] |= 1 << b;
                mat[m] |= 1 << b;
            }
        }
        return true;
    }
}
