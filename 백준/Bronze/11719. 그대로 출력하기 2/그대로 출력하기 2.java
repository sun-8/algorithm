import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Boolean tf = true;
        while(tf) {
            String s = br.readLine();
            if (s == null) {
                tf = false;
            } else {
                System.out.println(s);
            }
        }
        br.close();
    }
}