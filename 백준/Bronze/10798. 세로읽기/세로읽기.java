import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sArr = new String[5];
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<sArr.length; i++) {
            sArr[i] = br.readLine();
        }

        for(int i=0; i<15; i++) {
            for(int j=0; j<5; j++) {
                if (sArr[j].length() > i) {
                    sb.append(sArr[j].charAt(i));
                }
            }
        }
        
        System.out.println(sb);
        br.close();
    }
}