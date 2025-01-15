import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        
        // 테스트케이스 t
        int t = Integer.parseInt(br.readLine());
        
        for(int i=0; i<t; i++) {
            // 반복횟수와 문자열 입력
            String[] s = br.readLine().split(" ");
            
            // 문자열의 각 문자를 반복횟수만큼 더하도록 함
            for(int k=0; k<s[1].length(); k++) {
                for(int j=0; j<Integer.parseInt(s[0]); j++) {
                    result.append(s[1].charAt(k));
                }
            }
            result.append("\n");
        }
        System.out.println(result);
    }
}