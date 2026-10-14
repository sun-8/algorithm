class Solution {
    public int solution(String[] babbling) {
        final String[] baby = {"aya", "ye", "woo", "ma"};
        
        int answer = 0;
        for(int i=0; i<babbling.length; i++) {
            int matchCnt = 0;
            String resultStr = "";
            for(int j=0; j<baby.length; j++) {
                if(babbling[i].contains(baby[j])) {
                    babbling[i] = babbling[i].replace(baby[j], " ");
                    matchCnt++;
                }
            }
            for(int k=0; k<matchCnt; k++) {
                resultStr += " ";
            }
            if(resultStr.equals(babbling[i])) {
                answer++;
            }
        }
        return answer;
    }
}