import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();
        
        for(int a = 97; a < 97+26; a++) {
            int idx = str.indexOf(String.valueOf((char)a));
            bw.write(String.valueOf(idx));
            if (a != a+26) {
                bw.write(" ");
            }
            bw.flush();
        }
        br.close();
        bw.close();
    }
}