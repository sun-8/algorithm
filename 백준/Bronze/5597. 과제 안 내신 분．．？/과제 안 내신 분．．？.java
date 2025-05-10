import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        final int STUDENT_COUNT = 30;
        final int SUBMIT_ASSIGNMENT = 28;
        
        Map<Integer, Integer> map = new HashMap<>();
        // 제출자 입력
        for(int i=0; i<SUBMIT_ASSIGNMENT; i++) {
            int count = Integer.parseInt(br.readLine());
            map.put(count, count);
        }
        // 미제출자 탐색
        for(int i=1; i<=STUDENT_COUNT; i++) {
            if (map.get(i) == null) {
                bw.write(String.valueOf(i));
                bw.newLine();
                bw.flush();
            }
        }
        
        br.close();
        bw.close();
    }
}