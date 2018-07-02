import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
int hour=Integer.parseInt(Scanner.nextLine());
int minutes=Integer.parseInt(Scanner.nextLine());
   DateTimeFormatter FormatterB=     DateTimeFormatter.ofPattern("hh:mm");
        LocalDate localDate= LocalDate.parse(hour, FormatterB);
        System.out.println(localDate.plu);

    }
}
