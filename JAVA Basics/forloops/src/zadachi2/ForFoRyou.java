package zadachi2;

import java.util.Scanner;

public class ForFoRyou {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        int n = Integer.parseInt(Scanner.nextLine());
        int count = 0;
        String a = "";
        int b=0;

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        if (n == (i * j) + (k * l)) {
                            if (i < j) {
                                if (k > l) {
                                    System.out.printf("%d%d%d%d ", i, j, k, l);
                                    count++;
                                    if (count == 4) {
                                        a = String.format("%d%d%d%d", i, j, k, l);
                                    }
                                }

                            }

                        }
                    }
                }
            }
        }
        if (count >= 4) {
            System.out.printf("%nPassword: %s", a);
        }
        else {
            System.out.println("No!");
        }


    }
}

