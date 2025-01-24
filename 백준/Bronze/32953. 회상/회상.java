import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 수업한 개수 입력
        int n = Integer.parseInt(st.nextToken());
        // 분석의뢰 수업 개수 입력
        int m = Integer.parseInt(st.nextToken());
        
        // 각 반의 학생 수와 학번 입력
        for(int i=0; i<n; i++) {
            int student = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            // 학번의 중복 개수 세기
            for(int j=0; j<student; j++) {
                String s = st.nextToken();
                if(map.containsKey(s)) {
                    map.put(s, map.get(s)+1);
                } else {
                    map.put(s, 1);
                }
            }
        }
        
        // 분석의로 수업 개수 이상 수업을 들은 학생의 수 출력
        int cnt = 0;
        for(Integer i : map.values()) {
            if (i >= m) cnt++;
        }
        System.out.println(cnt);
        br.close();
    }
}