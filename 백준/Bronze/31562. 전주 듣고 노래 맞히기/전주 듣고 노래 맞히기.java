import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<>();
        
        // song[0] : 음을 아는 노래의 개수 , song[1] : 노래 문제 개수
        String[] song = br.readLine().split(" ");
        
        // 음을 아는 노래 저장
        for(int i=0; i<Integer.parseInt(song[0]); i++) {
            // s[0] : 노래 문자열 개수 , s[1] : 노래 제목 , s[2]~ : 노래의 음이름
            String[] s = br.readLine().split(" ");
            map.put(s[1], s[2]+s[3]+s[4]);
        }
        
        // 노래 문제 출제
        for(int i=0; i<Integer.parseInt(song[1]); i++) {
            String s = br.readLine().replace(" ","");
            // 문제 맞추기
            int cnt = 0;
            String name = "";
            for(Map.Entry<String, String> m : map.entrySet()) {
                if(s.equals(m.getValue())) {
                    if (name.equals("")) {
                        name = m.getKey();
                    }
                    cnt++;
                }
            }
            // 결과 출력
            if(cnt == 0) {
                System.out.println("!");
            } else if (cnt == 1) {
                System.out.println(name);
            } else {
                System.out.println("?");
            }
        }
        
        br.close();
    }
}