import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> set = new HashSet<>();
        int i = 2;
        while(n > 1) {
            if(n % i == 0) {
                n = n / i;
                set.add(i);
                i = 2;
            } else {
                i++;
            }
        }
        int[] answer = new int[set.size()];
        i = 0;
        for(int num : set) {
            answer[i] = num;
            i++;
        }
        Arrays.sort(answer);
        return answer;
    }
}