import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        List<String> list = new ArrayList<>();
        for(String s : answer) {
            if(!"".equals(s)) {
                list.add(s);
            }
        }
        return list.toArray(new String[0]);
    }
}