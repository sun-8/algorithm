import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        final int INPUT_VALUE = 10;
        final int DIVIDE_VALUE = 42;
        
        int[] arr = new int[INPUT_VALUE];
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<10; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            arr[i] %= DIVIDE_VALUE;
            set.add(arr[i]);
        }
        
        bw.write(String.valueOf(set.size()));
        br.close();
        bw.close();
    }
}