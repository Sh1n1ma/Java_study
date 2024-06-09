package heima;

public class whileLoopDemo {
    public static void main(String[] args) {
        double peakHeight = 8848860;
        double paperThickness = 0.1;
        int num = 0;
        while(paperThickness <= peakHeight){
            paperThickness = paperThickness * 2;
            num++;
        }
        System.out.println(num);
    }
}
