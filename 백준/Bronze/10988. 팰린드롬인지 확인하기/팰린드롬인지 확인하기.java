import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String s1 = br.readLine();
        String s2 = new StringBuilder(s1).reverse().toString();
        
        bw.write(s1.equals(s2) ? "1" : "0");
        bw.flush();
        bw.close();
        br.close();
            
    }
}