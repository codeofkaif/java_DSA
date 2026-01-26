package Backtracking;

public class Queen {
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i =0 ; i<n ; i++){
            for(int j =0 ; j< n ; j++){
                board[i][j] = 'X';

            }
        }
        queen(board , 0);
    }
    private static void queen(char[][] board , int row){
        int n = board.length;
        if(n == row){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j]);

                }
                System.out.println();

            }
            System.out.println();
            return;
        }
        for(int j = 0 ; j<n ; j++){
            if(isSafe(board , row, j)){
                board[row][j] = 'Q';
                queen(board,row+1);
                board[row][j]= 'X';
            }
        }
    }

    static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;
        // check row
        for(int i = 0 ; i< n ; i++){
            if(board[row][i] == 'Q') return  false;
        }
        // check column;
        for(int j = 0; j<n ; j++){
            if(board[j][col]=='Q') return false;
        }
        // check North east
        int i = row;
        int j = col;
        while(i>=0 && j<n){
            if(board[i][j] == 'Q') return false;
            i--;
            j++;
        }
        // check west- south
         i = row;
         j = col;
        while(i<n && j>=0){
            if(board[i][j] == 'Q') return false;
            i++;
            j--;
        }

        // check east-south
        i = row;
        j = col;
        while(i<n && j<n){
            if(board[i][i] == 'Q') return false;
            i++;
            j++;
        }
        // check north-west
        i = row;
        j = col;
        while(i>=0 && j>=0){
            if(board[i][j] == 'Q') return false;
            i--;
            j--;
        }
        return true;
    }

}
