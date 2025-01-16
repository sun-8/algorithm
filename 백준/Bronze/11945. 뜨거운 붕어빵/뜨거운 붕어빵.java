import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine().split(" ")[0]);
        
        for(int i=0; i<n; i++) {
            String s = br.readLine();
            
            sb.append(new StringBuilder(s).reverse()).append("\n");
            
        }
        System.out.println(sb);
        br.close();
    }
}