import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 시험 본 과목 수
        int n = Integer.parseInt(br.readLine());
        // 성적
        double[] score = new double[n];
        double maxScore = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            score[i] = Double.parseDouble(st.nextToken());
            
            if (score[i] > maxScore) {
                maxScore = score[i];
            }
        }
        // 평균
        double sum = 0;
        for(int i=0; i<n; i++) {
            score[i] = score[i]/maxScore*100;
            sum += score[i];
        }
        
        bw.write(String.valueOf(sum/n));
        
        br.close();
        bw.close();
    }
}