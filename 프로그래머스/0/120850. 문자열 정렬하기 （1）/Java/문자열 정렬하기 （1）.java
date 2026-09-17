import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        String num_string = "";
        for(int i=0; i<my_string.length(); i++) {
            if(!((int)my_string.charAt(i) >= 97 && (int)my_string.charAt(i) <= 123)) {
                num_string += my_string.charAt(i);
            }
        }
        int[] answer = new int[num_string.length()];
        for(int i=0; i<num_string.length(); i++) {
            answer[i] = Integer.parseInt(String.valueOf(num_string.charAt(i)));
        }
        Arrays.sort(answer);
        return answer;
    }
}