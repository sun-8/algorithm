class Solution {
    public int solution(String A, String B) {
        int length = A.length();
        int answer = -1;
        
        for(int i=length; i>0; i--) {
            String result = "";
            for(int j=0; j<length; j++) {
                result += A.charAt((i+j+length) % length);
            }
            answer++;
            if(B.equals(result)) {
                return answer;
            }
        }
        
        return -1;
    }
}