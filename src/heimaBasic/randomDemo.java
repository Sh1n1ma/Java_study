package heimaBasic;
import java.util.Random;
import java.util.Scanner;
public class randomDemo {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int num = rand.nextInt(100) + 1;
        while (true){
            System.out.println("plz input num from 1-100");
            int inputNum = sc.nextInt();
            if (num == inputNum){
                System.out.println("right!");
                break;
            }else if (num < inputNum){
                System.out.println("too big");
            }else {
                System.out.println("too small");
            }
        }
    }
}
