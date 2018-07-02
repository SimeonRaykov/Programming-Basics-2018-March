import java.time.LocalDate;
        import java.time.format.DateTimeFormatter;
        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        String Date = Scanner.nextLine();
        DateTimeFormatter Formatter =DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate DateB = LocalDate.parse(Date, Formatter);
        System.out.println(DateB.plusDays(999).format(Formatter));
    }
}
