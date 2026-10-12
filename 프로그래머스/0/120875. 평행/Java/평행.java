class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        // 기울기 공식 (y2 - y1) / (x2 - x1) == (y4 - y3) / (x4 - x3)
        if(parallel(dots[0], dots[1], dots[2], dots[3])) answer = 1;
        if(parallel(dots[0], dots[2], dots[1], dots[3])) answer = 1;
        if(parallel(dots[0], dots[3], dots[2], dots[1])) answer = 1;
        return answer;
    }
    
    private boolean parallel(int[] a, int[] b, int[] c, int[] d) {
        return (b[0] - a[0]) * (d[1] - c[1]) == (b[1] - a[1]) * (d[0] - c[0]);
    }
}