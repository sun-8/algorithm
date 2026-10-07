class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int answer_x = 0;
        int answer_num = 0;
        String[] pArr = polynomial.split(" ");
        
        for(String p : pArr) {
            if("+".equals(p)) {
                continue;
            } else if(-1 == p.indexOf("x")) {
                answer_num += Integer.parseInt(p);
            } else {
                answer_x += "".equals(p.substring(0, p.indexOf("x"))) ? 
                    1 : Integer.parseInt(p.substring(0, p.indexOf("x")));
            }
        }
        
        if(answer_x == 0 && answer_num != 0) {
            answer = answer_num + "";
        } else if (answer_x != 0 && answer_num == 0) {
            answer = (answer_x == 1 ? "" : answer_x) + "x";
        } else {
            answer = (answer_x == 1 ? "" : answer_x) + "x + " +  answer_num;
        }
        return answer;
    }
}