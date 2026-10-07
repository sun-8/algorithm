class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        // 가장 긴 변이 배열 안에 있는 변인 경우
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        for(int i=max-min+1; i<max; i++) {
            answer++;
        }
        // 가장 긴 변이 나머지 한 변인 경우
        for(int i=max+min-1; i>=max; i--) {
            answer++;
        }
        return answer;
    }
}