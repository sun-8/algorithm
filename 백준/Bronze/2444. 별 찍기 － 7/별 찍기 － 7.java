import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i=1; i<=2*n-1; i++) {
            if (i <= n) {
                for(int a=1; a<=n-i; a++) {
                    bw.write(" ");
                }
                for(int b=n-i; b<n; b++) {
                    bw.write("*");
                }
                for(int c=1; c<i; c++) {
                    bw.write("*");
                }
            } else {
                for(int a=1; a<=i-n; a++) {
                    bw.write(" ");
                }
                for(int b=1; b<=2*n-i; b++) {
                    bw.write("*");
                }
                for(int c=1; c<=2*n-i-1; c++) {
                    bw.write("*");
                }
            }
            bw.write("\n");
            bw.flush();
        }
        br.close();
        bw.close();
    }
}