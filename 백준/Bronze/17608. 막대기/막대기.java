import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        
        for(int i=0; i<n; i++) {
            int m = Integer.parseInt(br.readLine());
            stack.push(m);
        }
        
        int pop = stack.pop();
        int cnt = 0;
        for(int i=0; i<n-1; i++) {
            if (pop < stack.peek()) {
                cnt++;
                pop = stack.pop();
            } else if (pop >= stack.peek()) {
                stack.pop();
            }
        }
        System.out.println(cnt+1);
        br.close();
    }
}