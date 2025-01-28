import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        String[] sArr = br.readLine().split(" ");
        int[] iArr = new int[n];
        for (int i=0; i<n; i++) {
            iArr[i] = Integer.parseInt(sArr[i]);
        }
        Arrays.sort(iArr);
        
        // m을 넘지 않으면서 m에 최대한 가까워야 한다.
        // 세 숫자가 모두 달라야 한다.
        int max = 0;
        for(int i=0; i<n-2; i++) {
            for(int j=i+1; j<n-1; j++) {
                for(int k=j+1; k<n; k++) {
                    if (max < iArr[i]+iArr[j]+iArr[k] 
                        && iArr[i]+iArr[j]+iArr[k] < m) {
                        max = iArr[i]+iArr[j]+iArr[k];
                    } else if (iArr[i]+iArr[j]+iArr[k] == m) {
                        System.out.println(iArr[i]+iArr[j]+iArr[k]);
                        return;
                    } 
                }
            }
        }
        System.out.println(max);
    }
}