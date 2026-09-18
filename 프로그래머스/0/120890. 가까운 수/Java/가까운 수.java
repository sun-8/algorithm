import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int answerDistance = 0;
        int idxDistance = 0;
        Arrays.sort(array);
        for(int i=0; i<array.length; i++) {
            answerDistance = Math.abs(answer - n);
            idxDistance = Math.abs(array[i] - n);
            if (answerDistance == idxDistance) {
                continue;
            } else if(i == 0 || answerDistance > idxDistance) {
                answer = array[i];
            }
        }
        return answer;
    }
}