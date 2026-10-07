class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] left = {-1, 0};
        int[] right = {1, 0};
        int[] up = {0, 1};
        int[] down = {0, -1};
        int[] answer = {0, 0};
        
        for(String s : keyinput) {
            switch(s) {
                case "left":
                    if(Math.abs(answer[0]+left[0]) <= board[0]/2) {
                        answer[0] = answer[0] + left[0];
                    }
                    if(Math.abs(answer[1]+left[1]) <= board[1]/2) {
                        answer[1] = answer[1] + left[1];
                    }
                    break;
                case "right":
                    if(Math.abs(answer[0]+right[0]) <= board[0]/2) {
                        answer[0] = answer[0] + right[0];
                    }
                    if(Math.abs(answer[1]+right[1]) <= board[1]/2) {
                        answer[1] = answer[1] + right[1];
                    }
                    break;
                case "up":
                    if(Math.abs(answer[0]+up[0]) <= board[0]/2) {
                        answer[0] = answer[0] + up[0];
                    }
                    if(Math.abs(answer[1]+up[1]) <= board[1]/2) {
                        answer[1] = answer[1] + up[1];
                    }
                    break;
                case "down":
                    if(Math.abs(answer[0]+down[0]) <= board[0]/2) {
                        answer[0] = answer[0] + down[0];
                    }
                    if(Math.abs(answer[1]+down[1]) <= board[1]/2) {
                        answer[1] = answer[1] + down[1];
                    }
                    break;
                default:
            }
        }
        return answer;
    }
}