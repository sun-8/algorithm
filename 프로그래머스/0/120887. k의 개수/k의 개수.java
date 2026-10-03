class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int a=i; a<=j; a++) {
            int tmp = a;
            while(tmp > 0) {
                if(k == tmp%10) answer++;
                tmp = tmp/10;
            }
        }
        return answer;
    }
}