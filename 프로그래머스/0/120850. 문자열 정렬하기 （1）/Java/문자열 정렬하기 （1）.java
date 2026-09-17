import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        String num_string = my_string.replaceAll("[a-z]", "");
        
        int[] answer = new int[num_string.length()];
        for(int i=0; i<num_string.length(); i++) {
            answer[i] = num_string.charAt(i) - '0';
        }
        Arrays.sort(answer);
        return answer;
    }
}