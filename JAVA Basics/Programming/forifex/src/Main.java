import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
int n=Integer.parseInt(Scanner.nextLine());
int sum1=0;
int sum2=0;
        for (int i = 0; i <n ; i++) {
            int number1=Integer.parseInt(Scanner.nextLine());
sum1+=number1;
        }
        for (int i = 0; i <n ; i++) {
            int number2=Integer.parseInt(Scanner.nextLine());
            sum2+=number2;
        }
        if(sum1==sum2){
            System.out.printf("Yes, sum = %d",sum1);
        }
        else{
            System.out.printf("No, diff = %d",Math.abs(sum1-sum2));
        }
    }
}