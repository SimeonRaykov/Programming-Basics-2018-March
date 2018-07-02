package zadachi2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);

        char a=Scanner.nextLine().charAt(0);
        char b=Scanner.nextLine().charAt(0);
        char c=Scanner.nextLine().charAt(0);
        char d=Scanner.nextLine().charAt(0);
int number=Integer.parseInt(Scanner.nextLine());
int count=0;

        for (char i ='A' ; i <=a ; i++) {
            for (char j  = 'a'; j <=b ; j++) {
                for (char k = 'a'; k <=c ; k++) {
                    for (char l = 'a'; l <=d ; l++) {
                        for (int m = 0; m <=number ; m++) {
                            count++;

                        }
                    }
                }
            }
        }
        System.out.println(count-1);

    }
}
