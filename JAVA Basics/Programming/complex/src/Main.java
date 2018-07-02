import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(Scanner.nextLine());
        double y1 = Double.parseDouble(Scanner.nextLine());
        double x2 = Double.parseDouble(Scanner.nextLine());
        double y2 = Double.parseDouble(Scanner.nextLine());
        double x = Double.parseDouble(Scanner.nextLine());
        double y = Double.parseDouble(Scanner.nextLine());
        if (!((x == x1 || x == x2) && (y1 <= y && y2 >= y) || ((y == y1 || y == y2) && (x1 <= x && x2 >= x)))){
            System.out.println("Inside / Outside");
        } else if ((x == x1 || x == x2) && (y1 <= y && y2 >= y) || ((y == y1 || y == y2) && (x1 <= x && x2 >= x))) {
            System.out.println("Border");

        }
        }

    }



