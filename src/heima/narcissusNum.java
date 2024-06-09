package heima;

public class narcissusNum {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            int ones = i % 10;
            int tens = i / 10 % 10;
            int hundreds = i / 100 % 10;
            if (Math.pow(ones, 3) + Math.pow(tens, 3) + Math.pow(hundreds, 3) == i) {
                System.out.println(i);
            }
        }
    }
}
