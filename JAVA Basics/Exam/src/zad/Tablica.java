package zad;

import java.util.Scanner;

public class Tablica {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        int number=Integer.parseInt(Scanner.nextLine());

        int n1=0;
        int n2=0;
        int n3=0;

        int k2=0;
        int k3=0;

        n1=number%10;
k2=number/10;
n2=k2%10;

k3=k2/10;
n3=k3%10;


        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <=n2 ; j++) {
                for (int k = 1; k <=n3; k++) {
                    System.out.printf("%d * %d * %d = %d;%n",i,j,k,i*j*k);
                }
            }
        }



    }
}
