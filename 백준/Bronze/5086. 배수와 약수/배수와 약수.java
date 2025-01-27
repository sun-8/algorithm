import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        while (true) {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            
            if (first == 0 && second == 0) {
                break;
            } else {
                if (second % first == 0) {
                    // 첫 번째 숫자가 두 번째 숫자의 약수인지 확인
                    System.out.println("factor");
                } else if (first % second == 0) {
                    // 첫 번째 숫자가 두 번째 숫자의 배수인지 확인
                    // == 두 번째 숫자가 첫 번째 숫자의 약수인지 확인
                    System.out.println("multiple");
                } else {
                    System.out.println("neither");
                }
            }
        }
        
        br.close();
    }
}