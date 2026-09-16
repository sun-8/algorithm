class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int floor = (box[0] / n) * (box[1] / n);
        int hight = box[2] / n;
        answer = floor * hight;
        return answer;
    }
}