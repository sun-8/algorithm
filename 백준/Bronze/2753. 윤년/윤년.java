import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prt = 0;
        int year = sc.nextInt();
        
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            prt = 1;
        }
        System.out.print(prt);
        sc.close();
    }
}