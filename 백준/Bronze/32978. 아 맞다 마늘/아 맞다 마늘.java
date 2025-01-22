import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> hs = new HashSet<>();
        
        int n = Integer.parseInt(br.readLine());
        
        String[] ingredient = br.readLine().split(" ");
        String[] realIngredient = br.readLine().split(" ");
        for(int i=0; i<n-1; i++) {
            hs.add(realIngredient[i]);
        }
        
        for(int i=0; i<n; i++) {
            if (!hs.remove(ingredient[i])) {
                System.out.println(ingredient[i]);
                br.close();
                return;
            }
        }
        
        br.close();
    }
}