
class Solution {
    public String solution(int age) {
        String answer = "";
        while(age/10 != 0 || age%10 != 0) {
            answer += (char)(age%10 + 97);
            age = age/10;
        }
        StringBuffer sb = new StringBuffer(answer);
        return sb.reverse().toString();
    }
}