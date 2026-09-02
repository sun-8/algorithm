class Solution {
    public int[] solution(int num, int total) {
        int[] arr = new int[num];
        int middleNum = total/num;
        int startNum = 0;
        
        if (total % num > 0) {
            startNum = middleNum - num/2 + 1;
        } else {
            startNum = middleNum - num/2;
        }
        
        for(int i=0; i<num; i++) {
            arr[i] = startNum++;
        }
        return arr;
    }
}