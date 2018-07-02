import java.util.Scanner;

public class l {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int n = Integer.parseInt(Scanner.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        for (int i = 0; i < n; i++) {
            double number = Double.parseDouble(Scanner.nextLine());
            if (number < 200) {
                p1 += 1;
            } else if (number <= 399) {
                p2 += 1;
            } else if (number <= 599) {
                p3 += 1;
            } else if (number <= 799) {
                p4 += 1;
            } else if (number >= 800) {
                p5 += 1;
            }

        }
        System.out.printf("%.2f%%%n",p1/n*100);
        System.out.printf("%.2f%%%n",p2/n*100);
        System.out.printf("%.2f%%%n",p3/n*100);
        System.out.printf("%.2f%%%n",p4/n*100);
        System.out.printf("%.2f%%",p5/n*100);
    }
}