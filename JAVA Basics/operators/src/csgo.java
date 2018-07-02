import java.util.Scanner;

public class csgo {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);

        int n=Integer.parseInt(Scanner.nextLine());
int numbers=0;

        for (int i = 0; i <n ; i++) {
            char a=Scanner.nextLine().charAt(0);
numbers+=a;
        }
        System.out.println(numbers);
    }
}
