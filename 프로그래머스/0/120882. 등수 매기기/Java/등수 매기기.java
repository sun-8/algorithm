import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int length = score.length;
        Double[] avgArr = new Double[length];
        Map<Integer, Double> map = new HashMap<>();
        int[] answer = new int[length];
        
        // 평균값 구하기 및 해시맵 적재
        for(int i=0; i<length; i++) {
            avgArr[i] = (score[i][0] + score[i][1]) / 2d;
            map.put(i, avgArr[i]);
        }
        
        // 평균값 구한 배열 내림차순
        Arrays.sort(avgArr, Collections.reverseOrder());
        
        // 정렬된 배열과 해시맵 반복문으로 인덱스에 순위 매기기
        int lank = 1;
        for(int i=0; i<length; i++) {
            int cnt = 0;
            for(Map.Entry<Integer, Double> m : map.entrySet()) {
                if(avgArr[i].equals(m.getValue())) {
                    answer[m.getKey()] = lank;
                    cnt++;
                }
            }
            map.values().removeAll(Collections.singleton(avgArr[i]));
            lank += cnt;
        }
        
        
        return answer;
    }
}