package zad;

import com.sun.org.apache.bcel.internal.classfile.SourceFile;

import java.util.Scanner;

public class CSGO {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);


        int n = Integer.parseInt(Scanner.nextLine());
        int money = Integer.parseInt(Scanner.nextLine());
        String ak47 = "ak47";
        String awp = "awp";
        String sg553 = "sg553";
        String grenade = "grenade";
        String flash = "flash";
        String glock = "glock";
        String bazooka = "bazooka";
        int topmoney = 0;

        if (n > 7) {
            System.out.printf("Sorry, you can't carry so many things!");
        } else {
            for (int i = 0; i < n; i++) {
                String weapon = Scanner.nextLine();
                if (weapon.equalsIgnoreCase(ak47)) {
                    topmoney += 2700;
                } else if (weapon.equalsIgnoreCase(sg553)) {
                    topmoney += 3500;
                } else if (weapon.equalsIgnoreCase(awp)) {
                    topmoney += 4750;
                } else if (weapon.equalsIgnoreCase(grenade)) {
                    topmoney += 300;
                } else if (weapon.equalsIgnoreCase(glock)) {
                    topmoney += 500;
                } else if (weapon.equalsIgnoreCase(flash)) {
                    topmoney += 250;
                } else if (weapon.equalsIgnoreCase(bazooka)) {
                    topmoney += 5600;
                }
            }
            if (topmoney < money) {
                System.out.printf("You bought all %s items! Get to work and defeat the bomb!", n);
            } else if (money < topmoney) {
                System.out.printf("Not enough money! You need %s more money.", Math.abs(money - topmoney));
            }

        }
    }
}