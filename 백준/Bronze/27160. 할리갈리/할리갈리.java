import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String rtn = "NO";
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++) {
            String[] s = br.readLine().split(" ");
            if(map.containsKey(s[0])) {
                map.put(s[0], map.get(s[0])+Integer.parseInt(s[1]));
            } else {
                map.put(s[0], Integer.parseInt(s[1]));
            }
        }
        
        for(Map.Entry<String, Integer> m : map.entrySet()) {
            if (m.getValue() == 5) {
                rtn = "YES";
            }
        }
        
        System.out.println(rtn);
        br.close();
    }
}