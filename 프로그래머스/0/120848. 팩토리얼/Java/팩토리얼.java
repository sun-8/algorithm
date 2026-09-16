class Solution {
    public int solution(int n) {
        int answer = 0;
        int factorial = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                factorial *= j;
            }
            if(factorial > n) break;
            else {
                answer = i;
                factorial = 1;
            }
        }
        return answer;
    }
}