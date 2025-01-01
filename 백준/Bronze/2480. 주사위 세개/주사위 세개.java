import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 주사위 입력
        String[] arr = br.readLine().split(" ");
        
        // 형변환
        int diceLength = arr.length;
        int[] dice = new int[diceLength];
        for(int i=0; i<diceLength; i++) {
            dice[i] = Integer.parseInt(arr[i]);
        }
        
        // 계산
        int rtn = 0;
        if (dice[0] == dice[1] && dice[1] == dice[2]) {
            rtn = 10000+dice[0]*1000;
        } else if (dice[0] == dice[1]) {
            rtn = 1000+dice[0]*100;
        } else if (dice[1] == dice[2]) {
            rtn = 1000+dice[1]*100;
        } else if (dice[2] == dice[0]) {
            rtn = 1000+dice[2]*100;
        } else {
            int max = 0;
            for(int i=0; i<diceLength; i++) {
                if (i == 0) {
                    max = dice[i];
                } else {
                    if(max < dice[i]) {
                        max = dice[i];
                    }
                }
            }
            rtn = max*100;
        }
        
        System.out.println(rtn);
        br.close();
    }
}