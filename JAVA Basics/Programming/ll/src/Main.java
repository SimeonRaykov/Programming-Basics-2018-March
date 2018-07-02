import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        int a = Integer.parseInt(Scanner.nextLine());
        int b = Integer.parseInt(Scanner.nextLine());
        int Perimeter = 2*(a+b);
        int Lice = a*b;
        System.out.printf("Perimeturut e %d%n, a liceto %d", Perimeter,  Lice );



    }

}


