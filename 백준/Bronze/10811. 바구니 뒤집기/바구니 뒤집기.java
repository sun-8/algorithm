import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // N 과 M 입력 받기
        StringTokenizer nm = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(nm.nextToken());
        int m = Integer.parseInt(nm.nextToken());
        
        // 바구니 정렬
        int[] basket = new int[n];
        for(int i=0; i<n; i++) {
            basket[i] = i + 1;
        }
        
        // i 와 j 입력 받기
        for(int a=0; a<m; a++) {
            StringTokenizer ij = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(ij.nextToken());
            int j = Integer.parseInt(ij.nextToken());
            
            // 바구니 순서 뒤집기
            int x = (j-i) % 2 == 0 ? (j-i) / 2 : (j-i) / 2 + 1;
            for(int b=0; b<x; b++) {
                int tmp = basket[i-1+b];
                basket[i-1+b] = basket[j-1-b];
                basket[j-1-b] = tmp;
            }
        }
        
        // 출력
        for(int a : basket) {
            bw.write(String.valueOf(a));
            bw.write(" ");
        }
        
        br.close();
        bw.close();
    }
}