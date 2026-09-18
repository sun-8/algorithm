import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sArr = s.split("");
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        
        for(String str : sArr) {
            map.merge(str, 1, Integer::sum);
        }
        for(Map.Entry<String, Integer> m : map.entrySet()) {
            if(m.getValue( ) == 1) {
                list.add(m.getKey());
            }
        }
        Collections.sort(list);
        for(String str : list) {
            answer += str;
        }
        return answer;
    }
}