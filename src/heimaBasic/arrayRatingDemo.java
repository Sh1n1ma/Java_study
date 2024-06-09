package heimaBasic;
import java.util.Scanner;
public class arrayRatingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] scores = new double[6];
        double outNum = 0;
        for (int i = 0; i < scores.length; i++) {
            System.out.println("plz input number " + i + ": ");
            scores[i] = sc.nextDouble();
            outNum += scores[i];
        }
        outNum/=scores.length;
        System.out.println("avg score"+outNum);
    }
}
