class Solution {
    public int solution(int n) {
        int answer = 0;
        int i=1;
        int factorial = 1;
        while(true) {
            factorial *= i;
            if(factorial > n) {
                answer = i-1;
                break;
            }
            else i++;
        }
        return answer;
    }
}