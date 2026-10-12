import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = numlist.clone();
        
        for(int i=0; i<answer.length; i++) {
            for(int j=i+1; j<answer.length; j++) {
                int di = Math.abs(answer[i] - n);
                int dj = Math.abs(answer[j] - n);
                if(di > dj || di == dj && answer[i] < answer[j]) {
                    int temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }
        }
        return answer;
    }
}