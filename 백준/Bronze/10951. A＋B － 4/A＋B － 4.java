import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        boolean tf = true;
        while(tf) {
            String s = br.readLine();
            if (s == null) {
                tf = false;
            } else {
                String[] sa = s.split(" ");
                System.out.println(Integer.parseInt(sa[0]) + Integer.parseInt(sa[1]));
            }
        }
        br.close();
    }
}