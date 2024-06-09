package heimaBasic;
import java.util.Scanner;

public class pwdValDemo {
    public static void main(String[] args) {
        int pwd = 520;
        Scanner sc = new Scanner(System.in);
        while (true){
            int inputNum = sc.nextInt();
            if (inputNum == pwd){
                System.out.println("YES");
                break;
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
