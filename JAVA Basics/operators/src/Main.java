import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int a = Integer.parseInt(Scanner.nextLine());
        int sumnumbers = 0;
        int sumglavni = 0;
        int summalki = 0;
        int sumelse = 0;
        String numbersmax = "";
        String glavnimax = "";
        String malkimax = "";
        String elsemax = "";

        for (int i = 0; i < a; i++) {
            char a1 = Scanner.nextLine().charAt(0);

            if (a1 >= 'a' && a1 <= 'z') {
                summalki += (int) a1;
malkimax+=a1;

            } else if (a1 >= '0' && a1 <= '9') {
                sumnumbers += (int) a1;
                numbersmax+=a1;
            } else if (a1 >= 'A' && a1 <= 'Z') {
                sumglavni += (int) a1;
                glavnimax+=a1;
            } else {
                sumelse+=(int)a1;
elsemax+=a1;
            }
        }



        if (sumnumbers >= sumglavni && sumnumbers >= summalki && sumnumbers >= sumelse) {
            System.out.printf("Biggest ASCII sum is:%d%n", sumnumbers);
            System.out.printf("Combination of characters is:%s", numbersmax);
        } else if (sumglavni >= sumnumbers && sumglavni >= summalki && sumglavni >= sumelse) {
            System.out.printf("Biggest ASCII sum is:%d%n", sumglavni);
            System.out.printf("Combination of characters is:%s", glavnimax);

        } else if (summalki >= sumnumbers && summalki >= sumglavni && summalki >= sumelse) {
            System.out.printf("Biggest ASCII sum is:%d%n", summalki);
            System.out.printf("Combination of characters is:%s", malkimax);
        } else if (sumelse >= sumnumbers && sumelse >= sumglavni && sumelse >= summalki) {
            System.out.printf("Biggest ASCII sum is:%d%n", sumelse);
            System.out.printf("Combination of characters is:%s", elsemax);
        }


    }


}

