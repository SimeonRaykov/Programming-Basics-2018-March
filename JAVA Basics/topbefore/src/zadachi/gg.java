package zadachi;

import java.util.Scanner;

public class gg {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            double money = Double.parseDouble(scan.nextLine());
            int months = Integer.parseInt(scan.nextLine());

            double interestSimple = money;
            double interestComplex = money;

            for (int i = 0; i < months; i++) {
                interestSimple += 0.03 * money;
            }
            for (int j = 0; j < months; j++) {
                double lastMonth = interestComplex;
                interestComplex = lastMonth + 0.027 * lastMonth;
            }
            System.out.printf("Simple interest rate: %.2f lv.%nComplex interest rate: %.2f lv.", interestSimple, interestComplex);

            if (interestComplex > interestSimple) {
                System.out.printf("%nChoose a complex interest rate. You will win %.2f lv.", (interestComplex - interestSimple));

            } else if (interestSimple > interestComplex) {
                System.out.printf("%nChoose a simple interest rate. You will win %.2f lv.", (interestSimple - interestComplex));
            }
        }
    }


