import java.util.*;

public class Main{
    public static void main(String[] args) {
        int visibleCount = 0;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            int height = sc.nextInt();
            // 스택이 비어있지 않고 현재 막대기의 높이가 스택의 맨 위 막대기보다 크다면
            while (!stack.isEmpty() && height >= stack.peek()) {
                stack.pop(); // 스택에서 맨 위의 막대기 제거
            }
            stack.push(height); // 현재 막대기를 스택에 추가
        }

        visibleCount = stack.size(); // 스택에 남아있는 막대기는 보이는 막대기들
        System.out.println(visibleCount);
        sc.close();
    }
}