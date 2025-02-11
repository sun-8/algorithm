import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        Deque<int[]> queue = new ArrayDeque<>();
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            if(st.nextToken().equals("1")) {
                int student = Integer.parseInt(st.nextToken());
                int menu = Integer.parseInt(st.nextToken());
                
                queue.add(new int[]{student, menu});
            } else {
                int menu = Integer.parseInt(st.nextToken());
                
                if (!queue.isEmpty()) {
                    if(menu == queue.peek()[1]) {
                        A.add(queue.poll()[0]);
                    } else {
                        B.add(queue.poll()[0]);
                    }
                }
            }
        }
        
        // 출력
        // A
        if (A.size() > 0) {
            A.sort((a,b) -> a.compareTo(b));
            for(Integer a : A) {
                sb.append(a).append(" ");
            }
        } else {
            sb.append("None");
        }
        sb.append("\n");
        // B
        if (B.size() > 0) {
            B.sort((a,b) -> a.compareTo(b));
            for(Integer b : B) {
                sb.append(b).append(" ");
            }
        } else {
            sb.append("None");
        }
        sb.append("\n");
        // C
        if (queue.size() > 0) {
            List<Integer> C = new ArrayList<>();
            for(int[] i : queue) {
                C.add(i[0]);
            }
            C.sort((a,b) -> a.compareTo(b));
            for(Integer c : C) {
                sb.append(c).append(" ");
            }
        } else {
            sb.append("None");
        }
        System.out.println(sb);
        br.close();
    }
}