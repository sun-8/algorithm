import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> queue = new ArrayDeque<>();
        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        List<Integer> C = new ArrayList<>();
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            if(st.nextToken().equals("1")) {
                int student = Integer.parseInt(st.nextToken());
                int menu = Integer.parseInt(st.nextToken());
                
                C.add(student);
                queue.add(menu);
            } else {
                int menu = Integer.parseInt(st.nextToken());
                
                if (C.size() > 0 && !queue.isEmpty()) {
                    if(menu == queue.remove()) {
                        A.add(C.get(0));
                    } else {
                        B.add(C.get(0));
                    }
                    C.remove(0);
                }
            }
        }
        
        // 출력
        if (A.size() > 0) {
            A.sort((a,b) -> a.compareTo(b));
            for(Integer a : A) {
                sb.append(a).append(" ");
            }
        } else {
            sb.append("None");
        }
        sb.append("\n");
        if (B.size() > 0) {
            B.sort((a,b) -> a.compareTo(b));
            for(Integer b : B) {
                sb.append(b).append(" ");
            }
        } else {
            sb.append("None");
        }
        sb.append("\n");
        if (C.size() > 0) {
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