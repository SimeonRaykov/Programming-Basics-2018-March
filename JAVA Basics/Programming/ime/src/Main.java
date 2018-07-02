import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner Scanner = new Scanner(System.in);
        String FirstName = Scanner.nextLine();
        String LastName = Scanner.nextLine();
	String YearsOld = Scanner.nextLine();
	String Town = Scanner.nextLine();
	String Gender = Scanner.nextLine();
        System.out.printf("Ti si %s%s, na %s%n ot %s, %s .", FirstName, LastName, YearsOld, Town, Gender);
    }
}
