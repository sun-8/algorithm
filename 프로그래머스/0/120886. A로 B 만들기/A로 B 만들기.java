import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        char[] bc = before.toCharArray();
        char[] ac = after.toCharArray();
        Arrays.sort(bc);
        Arrays.sort(ac);
        return new String(bc).equals(new String(ac)) ? 1 : 0;
    }
}