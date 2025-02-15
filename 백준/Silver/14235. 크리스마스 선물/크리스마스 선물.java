import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        
        // 아이들과 거점지를 방문한 횟수 n
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 거점지에서 a개의 선물을 충전
            int a = Integer.parseInt(st.nextToken());
            if (a == 0) { // 아이들을 만남
                if (q.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(q.poll()).append("\n");
                }
            } else { // 선물 충전
                for(int j=0; j<a; j++) {
                    q.add(Integer.parseInt(st.nextToken()));
                }
            }
        }
        
        System.out.print(sb);
        br.close();
    }
}