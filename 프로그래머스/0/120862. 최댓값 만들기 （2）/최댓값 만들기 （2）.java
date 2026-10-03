import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = -10000 * 10000;
        
        for(int i=0; i<numbers.length; i++) {
            for(int j=i; j<numbers.length; j++) {
                if(i == j) continue;
                answer = Math.max(answer, numbers[i]*numbers[j]);
            }
        }
        return answer;
    }
}