import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int rtn = 0;
        
        // 문자열의 길이
        int l = Integer.parseInt(br.readLine());
        // 길이만큼 입력된 문자열
        String s = br.readLine();
        
        // 해시 값 저장
        for(int i=0; i<l; i++) {
            // 소문자 a의 아스키 값은 97 (97-96=1)
            int charToInt = s.charAt(i)-96;
            rtn += charToInt * Math.pow(31, i);
        }
        
        bw.write(String.valueOf(rtn));
        bw.flush();
        bw.close();
        br.close();
    }
}