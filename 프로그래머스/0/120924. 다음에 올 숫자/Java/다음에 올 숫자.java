class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int differenceOrRatio = common[1] - common[0];
        int differenceOrRatio1 = common[2] - common[1];
        int d = 0;
        
        if(differenceOrRatio == differenceOrRatio1) {
            // 등차수열
            d = differenceOrRatio;
            answer = common[common.length - 1] + d;
        } else {
            // 등비수열
            answer = common[common.length - 1] * common[1] / common[0];
        }
        
        return answer;
    }
}