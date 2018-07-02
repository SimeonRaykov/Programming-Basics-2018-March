package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int i = 0; i < n; i++) { // цикъл за първия ред, който не е кух
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < n - 2; i++) { //цикъл за броя на кухите редовете
            System.out.printf("*");
            for (int j = 0; j < n - 2; j++) { //цикъл за празните пространства
                System.out.printf(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < n; i++) { // същия цикъл за ред, който не е кух
            System.out.print("*");
        }
        System.out.println();
    }
}