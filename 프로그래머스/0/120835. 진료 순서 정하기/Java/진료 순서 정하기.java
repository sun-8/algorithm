import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] sortAscArr = Arrays.copyOf(emergency, emergency.length);
        Arrays.sort(sortAscArr);
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<sortAscArr.length; i++) {
            map.put(sortAscArr[i], sortAscArr.length-i);
        }
        for(int i=0; i<emergency.length; i++) {
            emergency[i] = map.get(emergency[i]);
        }
        return emergency;
    }
}