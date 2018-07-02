package zadachi2;

import java.util.Scanner;

public class forloopsadv {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);

        int duljina=Integer.parseInt(Scanner.nextLine());
        int shirina=Integer.parseInt(Scanner.nextLine());
double visochina=Double.parseDouble(Scanner.nextLine());
double cena=Double.parseDouble(Scanner.nextLine());
double teglo=Double.parseDouble(Scanner.nextLine());


double duljinanamreja=(2*duljina)+(2*shirina);
double cenanamreja=duljinanamreja*cena;
double plosht=visochina*duljinanamreja;
double teglonamreja=teglo*plosht;

        System.out.printf("%.0f%n",duljinanamreja);
        System.out.printf("%.2f%n",cenanamreja);
        System.out.printf("%.3f",teglonamreja);

    }
}
