import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        List<String> list = new ArrayList<>();

        while(my_str.length() > n) {
            String tmp = my_str.substring(0, n);
            list.add(tmp);
            my_str = my_str.substring(n);
            
        }
        list.add(my_str);
        return list.toArray(new String[0]);
    }
}