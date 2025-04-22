import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[n];
        for (int x=0; x<n; x++) {
            arr[x] = x+1;
        }
        
        for (int x=0; x<m; x++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            
            // 공 교환
            int tmp = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = tmp;
        }

        for (int x=0; x<arr.length; x++) {
            sb.append(arr[x]);
            if (x != arr.length-1) {
                sb.append(" ");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}