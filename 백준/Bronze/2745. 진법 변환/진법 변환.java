import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int square = 1; // 제곱 계산
        int sum = 0; // 합
        
        String n = st.nextToken(); // 수
        int b = Integer.parseInt(st.nextToken()); // 진법
        
        // 반복문 순서 문자열 끝에서부터 앞으로
        for(int i=n.length()-1; i>=0; i--) {
            // 주어진 진법의 숫자 반환
            int num = Character.digit(n.charAt(i), b);
            
            // 10진법 계산 (Math.pow()로 0제곱 하면 1 안나옴)
            sum += num * square;
            
            // 다음 제곱 계산
            square *= b;
        }
        
        System.out.println(sum);
        br.close();
        
    }
}