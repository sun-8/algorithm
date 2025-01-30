import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int min=0;
        int max=0;
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i=0; i<n; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (i == 0) {
                min = a;
                max = a;
            } else {
                min = Math.min(a, min);
                max = Math.max(a, max);
            }
        }
        
        System.out.println(min + " " + max);
        br.close();
    }
}