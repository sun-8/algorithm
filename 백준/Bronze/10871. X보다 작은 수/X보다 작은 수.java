import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        String[] sArr = br.readLine().split(" ");
        
        for(int i=0; i<n; i++) {
            if (x > Integer.parseInt(sArr[i])) {
                sb.append(sArr[i]).append(" ");
            }
        }
        System.out.println(sb);
        br.close();
    }
}