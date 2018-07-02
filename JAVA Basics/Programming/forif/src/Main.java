import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        int n=Integer.parseInt(Scanner.nextLine());
        int min=Integer.MAX_VALUE;
        int count=0;
        for (int i = 0; i <n ; i++) {
            count++;
            int number=Integer.parseInt(Scanner.nextLine());
            if(number<min){
                min=number;

            }
        }
        System.out.println(min);
        System.out.println(count);
    }
}
