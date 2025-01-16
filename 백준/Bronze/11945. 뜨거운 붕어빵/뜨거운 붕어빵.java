import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 두 개의 정수 입력
        String[] sArr = br.readLine().split(" ");
        int n = Integer.parseInt(sArr[0]);
        int m = Integer.parseInt(sArr[1]);
        
        // n줄에 걸쳐 한 줄에 m개의 문자가 주어짐
        for(int i=0; i<n; i++) {
            char[] cArr = br.readLine().toCharArray();
            
            // 첫번째와 마지막 값을 바꾸기
            for(int j=0; j<m/2; j++) {
                char tmp = cArr[j];
                cArr[j] = cArr[m-1-j];
                cArr[m-1-j] = tmp;
            }
            bw.write(cArr);
            bw.newLine();
        }
        bw.flush();
        br.close();
        bw.close();
    }
}