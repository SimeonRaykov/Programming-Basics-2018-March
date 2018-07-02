import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        int a = Integer.parseInt(Scanner.nextLine());
        char b = Scanner.nextLine().toUpperCase().charAt(0);
        char c = Scanner.nextLine().toLowerCase().charAt(0);
        int d = Integer.parseInt(Scanner.nextLine());
        int e = Integer.parseInt(Scanner.nextLine());
        int f = Integer.parseInt(Scanner.nextLine());
        int N = Integer.parseInt(Scanner.nextLine());

        int count = 0;

        for (int i = 1; i <=a ; i++) {
            for (int j = 'A'; j <= b; j++) {
                for (int k = 'a'; k <=c; k++) {
                    for (int l = 1; l <= d; l++) {
                        for (int m = 1; m <=e; m++) {
                            for (int o = 1; o <= f; o ++) {
                                count++;
                                if(count==N){
                                    System.out.printf("%d%c%c%d%d%d",i,j,k,l,m,o);
                                }
                            }
                        }
                    }
                }
            }
        }
        if(N>count){
            System.out.println("No password on this position");
        }
    }
}








