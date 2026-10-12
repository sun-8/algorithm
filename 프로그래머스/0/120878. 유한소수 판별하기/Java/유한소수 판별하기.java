class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        // 최대공약수 구하기 (유클리드 호제법)
        int gcd = a;
        int temp = b;
        while(temp != 0) {
            int r = gcd % temp;
            gcd = temp;
            temp = r;
        }
        a = a / gcd;
        b = b / gcd;
        
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