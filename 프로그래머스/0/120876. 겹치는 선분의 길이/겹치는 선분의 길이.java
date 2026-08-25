import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        Map<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        
        for(int i=0; i<lines.length; i++) {
            for(int k=lines[i][0]; k<lines[i][1]; k++) {
                if(map.containsKey(k)) {
                    map.put(k, map.get(k)+1);
                } else {
                    map.put(k, 1);
                }
            }
        }
        
        for(Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() > 1) {
                answer++;
            }
        }
        return answer;
    }
}