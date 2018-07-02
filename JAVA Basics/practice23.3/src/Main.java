import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int hour = Integer.parseInt(Scanner.nextLine());
        int minutes = Integer.parseInt(Scanner.nextLine());

        minutes += 15;
        if (minutes >= 60) {
            hour++;
            minutes -= 60;
        }
        if(hour>=24){
            hour-=24;
        }
        if (minutes < 10) {
            System.out.printf("%d:0%d", hour, minutes);
        } else {
            System.out.printf("%d:%d", hour, minutes);
        }

    }
}






