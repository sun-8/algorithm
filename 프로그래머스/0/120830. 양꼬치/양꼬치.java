class Solution {
    public int solution(int n, int k) {
        int serviceCount = n/10;
        k -= serviceCount;
        int answer = (n*12000) + (k*2000);
        return answer;
    }
}