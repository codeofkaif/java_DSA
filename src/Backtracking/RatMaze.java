package Backtracking;

public class RatMaze {
    public static void main(String[] args) {
        int[][] arr = {
                {1 , 1 ,0, 1},
                {1, 1 ,1 ,1},
                {1 , 0 , 1 ,1}
        };
        ratRoute(0 , 0 , arr.length-1, arr[0].length-1 , arr , "");

    }
    private static void ratRoute(int sr  , int sc, int er, int ec ,int[][] arr , String s){
        if(sr> er || sc> ec) return;
        if(sr<0 || sc<0) return;
        if(arr[sr][sc] == -1) return;
        if(arr[sr][sc] == 0 ) return ;
        if(sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        arr[sr][sc] = -1;

        //move right
        ratRoute(sr  , sc+1, er, ec,arr,s+"R");
        // move down
        ratRoute(sr+1, sc, er,ec, arr, s+"D");
        // move left
        ratRoute(sr , sc-1, er , ec , arr ,s+"L");
        // move up
        ratRoute(sr-1, sc , er , ec , arr , s+"U");
        arr[sr][sc] = 1;

    }
}
