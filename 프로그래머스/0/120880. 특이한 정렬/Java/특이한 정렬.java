import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int length = numlist.length;
        int[] answer = new int[length];
        for(int i=0; i<length; i++) {
            answer[i] = Math.min(Math.abs(numlist[i]+n), Math.abs(numlist[i]-n));
        }
        for(int i=0; i<length; i++) {
            for(int j=i; j<length; j++) {
                if(answer[i] > answer[j]) {
                    int temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                    
                    temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }
        }
        for(int i=0; i<length-1; i++) {
            if(answer[i] == answer[i+1]) {
                int max = Math.max(numlist[i], numlist[i+1]);
                int min = Math.min(numlist[i], numlist[i+1]);
                numlist[i] = max;
                numlist[i+1] = min;
            }
        }
        
        return numlist;
    }
}