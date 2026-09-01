import java.util.*;

/*
    [0, 0, 0, 0, 0]
    [0, 0, 0, 0, 0]
    [0, 0, 0, 0, 0]
    [0, 0, 1, 1, 0]
    [0, 0, 0, 0, 0]
    25-12 = 13
    (n, k) -> (n-1, k-1) (n-1, k) (n-1, k+1) (n, k-1) (n, k) (n, k+1) (n+1, k-1) (n+1, k) (n+1, k+1) 
    
    
*/
class Solution {
    public int solution(int[][] board) {
        
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[i].length; j++) {
                if(board[i][j] == 1) {
                    //좌
                    if(j-1 >= 0) {
                        if(i-1 >= 0) {
                            board[i-1][j-1] = (board[i-1][j-1] == 1) ? 1 : 2;
                        }
                        board[i][j-1] = 2;
                        if(i+1 < board.length) {
                            board[i+1][j-1] = (board[i+1][j-1] == 1) ? 1 : 2;
                        }
                    }
                    //
                    if(i-1 >= 0) {
                        board[i-1][j] = (board[i-1][j] == 1) ? 1 : 2;
                    }
                    board[i][j] = 2;
                    if(i+1 < board.length) {
                        board[i+1][j] = (board[i+1][j] == 1) ? 1 : 2;
                    }
                    //우
                    if(j+1 < board[i].length) {
                        if(i-1 >= 0) {
                            board[i-1][j+1] = (board[i-1][j+1]) == 1 ? 1 : 2;
                        }
                        board[i][j+1] = (board[i][j+1] == 1) ? 1 : 2;
                        if(i+1 < board.length) {
                            board[i+1][j+1] = (board[i+1][j+1] == 1) ? 1 : 2;
                        }
                    }
                    
                }
            }
        }
        
        int total = 0;
        int answer = 0;
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[i].length; j++) {
                total++;
                if(board[i][j] == 2) answer++;
            }
        }
        return total - answer;
    }
}