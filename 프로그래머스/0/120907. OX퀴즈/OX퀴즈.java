class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i=0; i<quiz.length; i++) {
            String[] qArr = quiz[i].split(" ");
            
            int x = Integer.parseInt(qArr[0]);
            int y = Integer.parseInt(qArr[2]);
            int o = "-".equals(qArr[1]) ? -1 : 1;
            int r = Integer.parseInt(qArr[4]);
            
            if (x + o*y == r) {
                answer[i] = "O";
            } else answer[i] = "X";
        }
        return answer;
    }
}