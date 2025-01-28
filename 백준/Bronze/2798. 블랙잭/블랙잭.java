import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        // m을 넘지 않으면서 m에 최대한 가까워야 한다.
        // 세 숫자가 모두 달라야 한다.
        String[] sArr = br.readLine().split(" ");
        int one = 0, two = 0, three = 0, max = 0;
        
        for(int i=0; i<n; i++) {
            // 첫번째 숫자
            one = Integer.parseInt(sArr[i]);
            
            for(int j=0; j<n; j++) {
                // 두번째 숫자
                two = Integer.parseInt(sArr[j]);
                if (one == two || one+two > m) {
                    continue;
                }
                
                for(int k=0; k<n; k++) {
                    // 세번째 숫자
                    three = Integer.parseInt(sArr[k]);
                    if ((one == three || two == three) || one+two+three > m) {
                        continue;
                    }
                    
                    if (max < one+two+three && one+two+three <= m) {
                        max = one+two+three;
                    }
                }
            }
        }
        System.out.println(max);
    }
}