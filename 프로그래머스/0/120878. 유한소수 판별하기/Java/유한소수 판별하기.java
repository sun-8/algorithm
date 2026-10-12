class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        int c = Math.min(a, b);
        for(int i=2; i<=c; i++) {
            while(a % i == 0 && b % i == 0) {
                a = a/i;
                b = b/i;
            }
        }
        while(b > 1) {
            if(b % 2 == 0) b = b/2;
            else if(b % 5 == 0) b = b/5;
            else {
                answer = 2;
                break;
            }
        }
        return answer;
    }
}