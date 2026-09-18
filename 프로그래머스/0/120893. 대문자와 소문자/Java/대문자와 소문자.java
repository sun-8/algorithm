class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(char s : my_string.toCharArray()) {
            if(Character.isUpperCase(s)) {
                answer += Character.toLowerCase(s);
            } else {
                answer += Character.toUpperCase(s);
            }
        }
        return answer;
    }
}