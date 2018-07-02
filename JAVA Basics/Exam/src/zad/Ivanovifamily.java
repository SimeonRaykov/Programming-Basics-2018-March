package zad;

import java.util.Scanner;

public class Ivanovifamily {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);

        double budget=Double.parseDouble(Scanner.nextLine());
        double first=Double.parseDouble(Scanner.nextLine());
        double second=Double.parseDouble(Scanner.nextLine());
        double third=Double.parseDouble(Scanner.nextLine());

double sum=first+second+third;
double budgetremaining=(budget-sum)-((budget-sum)*10/100);
        System.out.printf("%.2f",budgetremaining);


    }
}
