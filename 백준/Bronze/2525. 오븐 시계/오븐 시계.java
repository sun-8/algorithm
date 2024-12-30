import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nowTime = br.readLine().split(" ");
        int cookTime = Integer.parseInt(br.readLine());

        int nowH = Integer.parseInt(nowTime[0]);
        int nowM = Integer.parseInt(nowTime[1]);
        int cookH = cookTime / 60;
        int cookM = cookTime % 60;

        if (cookH > 0) {
            nowH += cookH;
            if (nowH >= 24) {
                nowH -= 24;
            }
        }

        if (cookM > 0) {
            nowM += cookM;
            if (nowM >= 60) {
                nowH++;
                if (nowH >= 24) {
                    nowH -= 24;
                }
                nowM -= 60;
            }
        }
        
        System.out.println(nowH + " " + nowM);
        br.close();
    }
}