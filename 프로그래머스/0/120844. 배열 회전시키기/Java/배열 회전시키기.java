class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if("left".equals(direction)) {
            for(int i=0; i<numbers.length; i++) {
                if(i==0) answer[numbers.length-1] = numbers[i];
                else answer[i-1] = numbers[i];
            }
        } else {
            for(int i=0; i<numbers.length; i++) {
                if(i==0) answer[i] = numbers[numbers.length-1];
                else answer[i] = numbers[i-1];
            }
        }
        return answer;
    }
}