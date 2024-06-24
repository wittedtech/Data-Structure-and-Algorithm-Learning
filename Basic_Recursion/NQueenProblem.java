/* Given a chessboard of size n, the problem is to place n queens on the n * n chessboard, so no two queens 
are attacking each other.

It is clear that for this problem, we need to find all the arrangements of the positions of the n queens on the 
chessboard, but there is a constraint: no queen should be able to attack another queen. */

import java.util.ArrayList;
import java.util.List;

public class NQueenProblem {
    public static void saveBoard(char[][] board, List<List<String>> allBoards){
        String row="";
        List<String> newBoard = new ArrayList<>();
        for(int i=0; i<board.length; i++){
            row ="";
            for(int j=0; j<board.length; j++){
                if(board[i][j] == 'Q')
                    row += 'Q';
                else
                    row += '.';
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    public static boolean isSafe(int row, int col, char[][] board){
        // horizontal
        for(int j=0; j<board.length; j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }
        // vertical
        for(int i=0; i<board.length; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        // daigonal upper left
        int r=row;
        for(int c=col; c>=0 && r>=0; c-- , r--)
        if(board[r][c] == 'Q'){
            return false;
        }

        // daigonal upper right
        r = row;
        for(int c=col; c<board.length && r>=0; c++,r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        // daigonal lower left
        r = row;
        for(int c=col; c>=0 && r<board.length; c--,r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        // daigonal lower right
        r = row;
        for(int c= col; c<board.length && r<board.length; c++, r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static void helper(char[][]board, List<List<String>> allBoards, int col){
        if(col == board.length){
            saveBoard(board, allBoards);
        }
        for(int row=0; row<board.length; row++){
            if(isSafe(row,col,board)){
                board[row][col] = 'Q';
                helper(board, allBoards, col+1);
                board[row][col] = '.';
            }
        }
    }
    public static List<List<String>> solveNQUeens(int n){
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        // function using backtrack algorithm and getting called recursively.
        helper(board, allBoards, 0);
        return allBoards;
    }
    public static void main(String[] args) {
        int n = 5;
        List<List<String>> boards = solveNQUeens(n);
        System.out.println(boards);
    }
}
