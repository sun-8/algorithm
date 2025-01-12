import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        boolean tf = true;
        while(tf) {
            String[] s = br.readLine().split(" ");
            if (s[0].equals("0") && s[1].equals("0")) {
                tf = false;
            } else {
                System.out.println(Integer.parseInt(s[0]) + Integer.parseInt(s[1]));
            }
        }
        br.close();
        
    }
}