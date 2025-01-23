import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<>();
        
        // song[0] : 음을 아는 노래의 개수 , song[1] : 노래 문제 개수
        String[] song = br.readLine().split(" ");
        
        // 음을 아는 노래 저장
        for (int i=0; i<Integer.parseInt(song[0]); i++) {
            // s[0] : 노래 문자열 개수 , s[1] : 노래 제목 , s[2]~ : 노래의 음이름
            String[] s = br.readLine().split(" ");
            // value 중복 체크
            if (map.containsKey(s[2]+s[3]+s[4])) {
                map.put(s[2]+s[3]+s[4], "?");
            } else {
                map.put(s[2]+s[3]+s[4], s[1]);
            }
        }
        
        // 노래 문제 출제
        for (int i=0; i<Integer.parseInt(song[1]); i++) {
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