import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int max = 0;
        int maxIndex = 0;
        
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }
        
        System.out.println(arr[maxIndex]);
        System.out.println(maxIndex+1);
        br.close();
    }
}