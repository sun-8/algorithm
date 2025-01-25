import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        System.out.println(n == 1 ? "Leading the Way to the Future" : "YONSEI");
        br.close();
    }
}