import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 소괄호, 대괄호 골라내어 저장 및 균형 체크
        while (true) {
            String s = br.readLine();

            if (s.equals(".")) {
                break;
            } else {
                ArrayDeque<Character> stack = new ArrayDeque<>();
                boolean isBalanced = true;

                for (char c : s.toCharArray()) {
                    if (c == '(' || c == '[') {
                        stack.push(c); // 열린 괄호는 스택에 넣기
                    } else if (c == ')' || c == ']') {
                        if (stack.isEmpty() || (c == ')' && stack.peek() != '(') || (c == ']' && stack.peek() != '[')) {
                            isBalanced = false; // 짝이 맞지 않으면 불균형
                            break;
                        } else {
                            stack.pop(); // 짝을 이루면 스택에서 pop
                        }
                    }
                }

                if (isBalanced && stack.isEmpty()) {
                    sb.append("yes\n"); // 균형이 맞다면 yes
                } else {
                    sb.append("no\n"); // 불균형이면 no
                }
            }
        }
        System.out.print(sb);
        br.close();
    }
}