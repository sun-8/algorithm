import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        // 세번 반복
        for(int i=0; i<3; i++) {
            // 윷 던지기
            st = new StringTokenizer(br.readLine());
            
            int ZeroCnt = 0;
            // 네 개의 윷짝
            for(int j=0; j<4; j++) {
                if(Integer.parseInt(st.nextToken()) == 0) {
                    ZeroCnt++;
                }
            }
            // 결과 출력
            switch(ZeroCnt) {
                case 1:
                    System.out.println("A");
                    break;
                case 2:
                    System.out.println("B");
                    break;
                case 3:
                    System.out.println("C");
                    break;
                case 4:
                    System.out.println("D");
                    break;
                default:
                    System.out.println("E");
            }
        }
        
        br.close();
    }
}