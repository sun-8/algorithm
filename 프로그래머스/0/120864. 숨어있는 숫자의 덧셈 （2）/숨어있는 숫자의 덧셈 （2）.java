class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split("[a-z|A-Z]");
        for(String s : arr) {
            System.out.println(s);
            if(!"".equals(s)) answer += Integer.parseInt(s);
        }
        return answer;
    }
}