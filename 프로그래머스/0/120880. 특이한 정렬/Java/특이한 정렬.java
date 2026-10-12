import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Integer[] arr = new Integer[numlist.length];
        for(int i=0; i<arr.length; i++) {
            arr[i] = numlist[i];
        }
        Arrays.sort(arr, (a, b) -> {
            int da = Math.abs(a-n);
            int db = Math.abs(b-n);
            if(da != db) return da - db;
            return b - a;
        });
        int[] answer = new int[arr.length];
        for(int i=0; i<answer.length; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}