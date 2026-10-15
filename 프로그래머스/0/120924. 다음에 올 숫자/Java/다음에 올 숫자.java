class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int differenceOrRatio = common[1] - common[0];
        int differenceOrRatio1 = common[2] - common[1];
        double d = 0;
        
        if(differenceOrRatio == differenceOrRatio1) {
            // 등차수열
            d = differenceOrRatio;
            answer = (int)(common[common.length - 1] + d);
        } else {
            // 등비수열
            d = (double)common[1] / (double)common[0];
            answer = (int)(common[common.length - 1] * d);
        }
        
        return answer;
    }
}