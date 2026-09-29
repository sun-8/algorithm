import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] strArr = my_string.split(" ");
        Deque<String> stack = new ArrayDeque<>();
        Collections.addAll(stack, strArr);
        
        while(stack.peek() != null) {
            String str = stack.pop();
            if("+".equals(str)) {
                answer += Integer.parseInt(stack.pop()); 
            } else if("-".equals(str)) {
                answer -= Integer.parseInt(stack.pop()); 
            } else {
                answer += Integer.parseInt(str); 
            }
        }
        return answer;
    }
}