class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        int cnt = 0;
        for(String d : dic) {
            for(String s : spell) {
                if(d.contains(s)) {
                    d = d.replace(s, "");
                    cnt++;
                }
                else break;
            }
            if(cnt == spell.length) {
                answer = 1;
                break;
            } else cnt = 0;
        }
        return answer;
    }
}