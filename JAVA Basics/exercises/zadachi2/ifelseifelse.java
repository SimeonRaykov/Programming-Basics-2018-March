package zadachi2;

import java.util.Scanner;

public class ifelseifelse {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        double teglonapratka = Double.parseDouble(Scanner.nextLine());
        String usluga = Scanner.nextLine();
        double raztoqnie = Double.parseDouble(Scanner.nextLine());
        double teglona2 = teglonapratka;
        double expresscena = 0;
        double expresscena1 = 0;
        double expresscena2 = 0;

        double cena = 0;

        if (usluga.equalsIgnoreCase("standard")) {
            if (teglonapratka < 1) {
                cena = 0.03 * raztoqnie;
            } else if (teglonapratka <= 10.99 && teglonapratka>=1) {
                cena = 0.05 * raztoqnie;
            } else if (teglonapratka <= 40.99 && teglonapratka>=11) {
                cena = 0.10 * raztoqnie;
            } else if (teglonapratka <= 90.99 && teglonapratka>=41) {
                cena = 0.15 * raztoqnie;
            } else if (teglonapratka <= 150 && teglonapratka>=91) {
                cena = 0.20 * raztoqnie;
            }
            System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", teglonapratka, cena);
        } else if (usluga.equalsIgnoreCase("express")) {
            if (teglonapratka <1 ) {
                cena = 0.03 * raztoqnie;
                expresscena = cena-cena*20/100;
                expresscena1 = teglona2 * expresscena;
                expresscena2 = cena + expresscena1;
            } else if (teglonapratka <= 10.99) {
                cena = 0.05 * raztoqnie;
                expresscena = cena-cena*60/100;
                expresscena1 = teglona2 * expresscena;
                expresscena2 = cena + expresscena1;
            } else if (teglonapratka <= 40.99 ) {
                cena = 0.10 * raztoqnie;
                expresscena =cena-cena*95/100;
                expresscena1 = teglona2 * expresscena;
                expresscena2 = cena + expresscena1;
            } else if (teglonapratka <= 90.99) {
                cena = 0.15 * raztoqnie;
                expresscena = cena-cena*98/100;
                expresscena1 = teglona2 * expresscena;
                expresscena2 = cena + expresscena1;

               expresscena2=raztoqnie*(0.15+(0.15*0.02*teglona2));

            } else if (teglonapratka <= 150 ) {
                cena = 0.20 * raztoqnie;
                expresscena = cena-cena*99/100;
                expresscena1 = teglona2 * expresscena;
                expresscena2 = cena + expresscena1;
            }
            System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", teglonapratka, expresscena2);
        }


    }
}
