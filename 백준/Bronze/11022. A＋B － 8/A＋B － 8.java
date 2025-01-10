import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        for(int i=1; i<=t; i++) {
            String[] s = br.readLine().split(" ");
            System.out.println("Case #" + i + ": " 
                               + Integer.parseInt(s[0]) + " + " + Integer.parseInt(s[1])
                               + " = " + (Integer.parseInt(s[0]) + Integer.parseInt(s[1])));
        }
        br.close();
    }
}