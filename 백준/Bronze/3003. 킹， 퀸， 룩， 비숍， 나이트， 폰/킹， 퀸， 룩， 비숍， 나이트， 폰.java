import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String[] arr = br.readLine().split(" ");
        
        for(int i=0; i<arr.length; i++) {
            int peice = Integer.parseInt(arr[i]);
            switch(i) {
                case 0: case 1:
                    sb.append(1 - peice).append(" ");
                    break;
                case 2: case 3: case 4:
                    sb.append(2 - peice).append(" ");
                    break;
                case 5:
                    sb.append(8 - peice);
                    break;
                default:
                    break;
            }
        }
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}