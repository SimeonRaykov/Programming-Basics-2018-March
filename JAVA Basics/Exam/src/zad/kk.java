package zad;

import java.util.Scanner;

public class kk {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        String g=Scanner.nextLine();
        int age=Integer.parseInt(Scanner.nextLine());
        int yearsWork=Integer.parseInt(Scanner.nextLine());

        int diffyears = Math.abs(age - 64);
        int diffwork = Math.abs(yearsWork - 38);
        System.out.printf("Too early. Years left to retirement: %d. Work experience left to retirement:%d", diffyears, diffwork);
    }
}
