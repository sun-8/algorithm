import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        String[] answer = new String[score.length];

        // score를 q에 담기
        for(int i : score) {
            q.add(i);
        }

        // q가 비어있을 때 까지 반복.
        // 그 안에 score 반복문을 통해 q의 top값과 score의 요소가 같으면 answer에 String으로 변환하여 순위 저장
        int th = 1;
        while(!q.isEmpty()) {
            int e = q.poll();
            for(int i=0; i<score.length; i++) {
                if (e == score[i]) {
                    answer[i] = String.valueOf(th);
                    th++;
                }
            }
        }

        // 1, 2, 3위 설정
        for(int i=0; i<answer.length; i++) {
            boolean first = false;
            boolean second = false;
            boolean third = false;

            if (answer[i].equals("1")) {
                answer[i] = "Gold Medal";
            } else if (answer[i].equals("2")) {
                answer[i] = "Silver Medal";
            } else if (answer[i].equals("3")) {
                answer[i] = "Bronze Medal";
            } else if (first && second && third) {
                break;
            }
        }

        return answer;
    }
}