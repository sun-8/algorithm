import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 4개의 과일을 인덱스로 매핑
        int[] fruitCounts = new int[4];
        String[] fruits = {"STRAWBERRY", "BANANA", "LIME", "PLUM"};
        
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            String fruit = s[0];
            int count = Integer.parseInt(s[1]);
            
            // 과일 이름에 따라 배열 인덱스에 값 추가
            for (int j = 0; j < 4; j++) {
                if (fruit.equals(fruits[j])) {
                    fruitCounts[j] += count;
                    break;
                }
            }
        }
        
        // 5개가 있는지 확인
        for (int count : fruitCounts) {
            if (count == 5) {
                System.out.println("YES");
                br.close();
                return;
            }
        }
        
        System.out.println("NO");
        br.close();
    }
}