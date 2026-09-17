import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        List<String> list = new ArrayList<>();
        for(char c : my_string.toCharArray()) {
            if(!list.contains(String.valueOf(c))) {
                list.add(String.valueOf(c));
            }
        }
        for(String s : list) {
            answer += s;
        }
        return answer;
    }
}