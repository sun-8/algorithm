import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        Queue<Integer> q = new PriorityQueue<>();
        int answer = 0;
        
        // scoville요소를 q에 담기
        for(int i : scoville) {
            q.add(i);
        }

        // q에서 첫번째 요소가 K보다 작을 때 까지
        // 만약, 첫번째 요소가 K보다 작지만 size가 1이면 break
        while(q.peek() < K) {
            if (q.size() == 1) {
                answer = -1;
                break;
            } else {
                int firstMin = q.poll();
                int secondMin = q.poll();
                q.add(firstMin + (secondMin*2));
                answer++;
            }
        }
        return answer;
    }
}