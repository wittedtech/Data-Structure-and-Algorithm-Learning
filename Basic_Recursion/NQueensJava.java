public class NQueensJava {
    private int size;
    private int[] board;

    public NQueensJava(int size) {
        this.size = size;
        board = new int[size];
    }

    public void solve() {
        placeQueen(0);
    }

    private boolean placeQueen(int row) {
        if (row == size) {
            printBoard();
            return true; // Return true to find only one solution, remove to find all solutions
        }

        for (int col = 0; col < size; col++) {
            if (isSafe(row, col)) {
                board[row] = col;
                if (placeQueen(row + 1)) {
                    return true; // Return true to stop after first solution
                }
                // Backtrack
            }
        }
        return false;
    }

    private boolean isSafe(int row, int col) {
        for (int i = 0; i < row; i++) {
            int placedCol = board[i];
            if (placedCol == col || Math.abs(placedCol - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }

    private void printBoard() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (board[row] == col) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 8; // Change n to any number to solve for n-Queens
        NQueensJava queens = new NQueensJava(n);
        queens.solve();
    }
}
