import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String a = new StringBuilder(st.nextToken()).reverse().toString();
        String b = new StringBuilder(st.nextToken()).reverse().toString();
        
        bw.write(String.valueOf(Math.max(Integer.parseInt(a), Integer.parseInt(b))));
        bw.flush();
        bw.close();
        br.close();
    }
}