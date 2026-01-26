package Backtracking;



public class Nknight {
    static int maxknight = -1;
    static int number = 8;
    private static boolean isSafe(char[][] grid, int row , int col ){
        int n = grid.length;
        if( grid[row][col]== n*n-1) return true;
        //1.  move up-right
        int i = row -2;
        int j = col+1;
        if(i>=0 && j<n && grid[i][j] == 'K') return false;

        //2. move up-left
        i = row -2;
        j = col-1;
        if(i>=0 && j>=0 && grid[i][j] == 'K') return false;

        //3. move right-down
        i = row +1;
        j = col+2;
        if(i<n && j<n && grid[i][j] == 'K') return false;

        //4. move right-up
        i = row -1;
        j = col+2;
        if(i>=0 && j<n && grid[i][j] == 'K') return false;

        //5. move down-right
        i = row +2;
        j = col+1;
        if(i<n && j<n && grid[i][j] == 'K') return false;

        //6. move down-left
        i = row +2;
        j = col-1;
        if((i<n && j>=0) && (grid[i][j] == 'K')) return false;

        //7. move left-up
        i = row -1;
        j = col-2;
        if((i>=0 && j>=0) && (grid[i][j] == 'K')) return false;

        //7. move left-down
        i = row +1;
        j = col-2;
        if((i<n && j>=0) && (grid[i][j] == 'K') )return false;

        return false;




    }

    private static void nKnight(char[][] board , int row , int col, int num){
        int n = board.length;
        System.out.println(num);
        if(row == n){
            if(num == number){
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(board[i][j]);

                    }
                    System.out.println();

                }
                System.out.println();
            }
            maxknight = Math.max(maxknight, num);
            return;
        }
        else if(isSafe(board , row , col )){
            System.out.println(5);
            board[row][col] = 'K';
            if(col != n-1) nKnight(board, row, col+1 , num+1);
            else nKnight(board , row+1, 0 , num+1);
            board[row][col] = 'X';
        }
        if(col != n-1) nKnight(board , row , col+1 , num);
        else nKnight(board , row+1 , 0 , num);
    }
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';

            }

        }
        nKnight(board, 0 ,0 ,0);
        System.out.println(maxknight);
    }
}
