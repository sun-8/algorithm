class Solution {
    public int[] solution(int[][] score) {
        int length = score.length;
        int[] sumArr = new int[length];
        int[] answer = new int[length];
        
        for(int i=0; i<length; i++) {
            sumArr[i] = score[i][0] + score[i][1];
        }
        
        for(int i=0; i<length; i++) {
            int cnt = 0;
            for(int j=0; j<length; j++) {
                if(sumArr[i] < sumArr[j]) {
                    cnt++;
                }
            }
            answer[i] = cnt + 1;
        }
        return answer;
    }
}