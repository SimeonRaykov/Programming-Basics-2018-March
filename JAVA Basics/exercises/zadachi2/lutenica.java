package zadachi2;

import java.util.Scanner;

public class lutenica {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);


        double kolichestvodomat = Double.parseDouble(Scanner.nextLine());
        double broikasetki = Double.parseDouble(Scanner.nextLine());
        double broiburkani = Double.parseDouble(Scanner.nextLine());


        double lutenica = kolichestvodomat / 5;
        double burkani = lutenica / 0.535;
        double kasetkifinal = burkani / broiburkani;

        double boxesleft = kasetkifinal - broikasetki;
        double jarsleft = burkani - (broiburkani * broikasetki);

        double boxesneeded =broikasetki-kasetkifinal;
        double jarsneeded =(broikasetki*broiburkani)-burkani;

        System.out.printf("Total lutenica: %.0f kilograms.%n",Math.floor(lutenica));
if(kasetkifinal>=broikasetki){
    System.out.printf("%.0f boxes left.%n",Math.floor(boxesleft));
    System.out.printf("%.0f jars left.",Math.floor(jarsleft));
}
else{
    System.out.printf("%.0f more boxes needed.%n",Math.floor(boxesneeded));
    System.out.printf("%.0f more jars needed.",Math.floor(jarsneeded));
}


    }
}
