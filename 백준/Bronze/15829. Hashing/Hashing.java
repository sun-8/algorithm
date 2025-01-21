import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final int r = 31;
        final int disjoint = 1234567891;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long squared = 1; // 제곱 계산 변수
        long rtn = 0; // 결과 저장 변수
        
        // 문자열의 길이
        int l = Integer.parseInt(br.readLine());
        // 길이만큼 입력된 문자열
        String s = br.readLine();
        
        // 해시 값 저장
        for(int i=0; i<l; i++) {
            // 소문자 a의 아스키 값은 97 (97-96=1)
            int charToInt = s.charAt(i)-96;
            rtn = (rtn + (charToInt * squared) % disjoint) % disjoint;
            // 다음 제곱값 계산
            squared = (squared * r) % disjoint;
        }
        
        bw.write(String.valueOf(rtn));
        bw.flush();
        bw.close();
        br.close();
    }
}