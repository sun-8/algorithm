import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] sortAscArr = Arrays.copyOf(emergency, emergency.length);
        Arrays.sort(sortAscArr);
        
        outer:
        for(int i=0; i<emergency.length; i++) {
            for(int j=0; j<sortAscArr.length; j++) {
                if(emergency[i] == sortAscArr[j]) {
                    emergency[i] = emergency.length-j;
                    continue outer;
                }
            }
        }
        return emergency;
    }
}