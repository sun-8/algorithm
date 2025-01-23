import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken()); // 알고있는 노래 개수
        int m = Integer.parseInt(st.nextToken()); // 문제 풀제 개수
        
        // 음을 아는 노래 저장
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken(); // 노래 제목 문자열 개수
            String title = st.nextToken(); // 노래 제목
            
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<3; j++) {
                sb.append(st.nextToken());
            }
            String melody = sb.toString(); // 노래 첫 세 음
            
            if (map.containsKey(melody)) {
                // 같은 음이 두 개 이상이라는 의미 => "?" 저장
                map.put(melody, "?");
            } else {
                map.put(melody, title);
            }
        }
        
        // 노래 문제 출제
        for (int i=0; i<m; i++) {
            String s = br.readLine().replace(" ","");
            // 문제 맞추기
            if (map.containsKey(s)) {
                System.out.println(map.get(s));
            } else {
                System.out.println("!");
            }
        }
        
        br.close();
    }
}