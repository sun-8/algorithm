import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true) {
            // 문자열 입력
            String s = br.readLine();
            
            // 입력이 끝났을 시 종료, 안끝났으면 출력
            if (s == null) {
                break;
            } else {
                System.out.println(s);
            }
        }
        // 입력 닫기
        br.close();
    }
}