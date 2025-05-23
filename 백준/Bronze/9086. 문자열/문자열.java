import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());
        String[] arr = new String[t];
        for(int i=0; i<t; i++) {
            arr[i] = br.readLine();
            bw.write(arr[i].charAt(0));
            bw.write(arr[i].charAt(arr[i].length()-1));
            bw.newLine();
            bw.flush();
        }
        
        br.close();
        bw.close();
    }
}