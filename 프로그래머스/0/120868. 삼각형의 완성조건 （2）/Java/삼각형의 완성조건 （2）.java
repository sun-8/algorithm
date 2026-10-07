class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        
        /*
        // 가장 긴 변이 배열 안에 있는 변인 경우
        for(int i=max-min+1; i<max; i++) {
            answer++;
        }
        max-1 - (max-min+1) +1 = max-1-max+min-1+1 = min-1
        // 마지막에 +1을 하는 이유는 시작값과 끝값을 포함하기 위해
        
        // 가장 긴 변이 나머지 한 변인 경우
        for(int i=max+min-1; i>=max; i--) {
            answer++;
        }
        max+min-1 - max + 1 = min
        // 마지막에 +1을 하는 이유는 시작값과 끝값을 포함하기 위해
        
        answer = min + (min-1)
        */
        return min + (min-1);
    }
}