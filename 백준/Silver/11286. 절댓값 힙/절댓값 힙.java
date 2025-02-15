import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        // 연산의 개수 N
        int N = Integer.parseInt(br.readLine());
        // 저장할 q
        Queue<Integer> q = new PriorityQueue<>((a,b) -> Math.abs(a) == Math.abs(b) ? Integer.compare(a, b) :Integer.compare(Math.abs(a), Math.abs(b)));
        
        for(int i=0; i<N; i++) {
            //  연산에 대한 정보
            int x = Integer.parseInt(br.readLine());
            
            if (x != 0) {
                q.add(x);
            } else {
                // q 비어있는지 유무 확인
                if (q.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    // 최소값 출력
                    sb.append(q.poll()).append("\n");
                }
            }
        }
        
        System.out.print(sb);
        br.close();
    }
}