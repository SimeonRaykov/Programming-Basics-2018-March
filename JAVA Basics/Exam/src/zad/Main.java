package zad;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        double days = Double.parseDouble(Scanner.nextLine());
        double firstday = Double.parseDouble(Scanner.nextLine());
        double sum = firstday;

        for (int i = 0; i < days; i++) {
            int procent = Integer.parseInt(Scanner.nextLine());
            firstday = firstday + firstday * (procent / 100D);
            sum += firstday;
        }
            if (sum >= 1000) {
                System.out.printf("You've done a great job running %.0f more kilometers!",Math.ceil(sum-1000));
            } else if (sum < 1000) {
                System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers",Math.ceil(1000-sum));
            }



    }
}
