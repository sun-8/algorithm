import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        Map<Character, Integer> beforeMap = new HashMap<>();
        Map<Character, Integer> afterMap = new HashMap<>();
        
        for(char c : before.toCharArray()) {
            beforeMap.merge(c, 1, Integer::sum);
        }
        for(char c : after.toCharArray()) {
            afterMap.merge(c, 1, Integer::sum);
        }
        
        for(Map.Entry<Character, Integer> m : beforeMap.entrySet()) {
            if(m.getValue() != afterMap.get(m.getKey())) answer = 0;
        }
        return answer;
    }
}