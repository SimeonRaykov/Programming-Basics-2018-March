import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        String cyka=Scanner.nextLine();
        int r=Integer.parseInt(Scanner.nextLine());
        int c=Integer.parseInt(Scanner.nextLine());
double price=0;
double totalprice=r*c;


        if(cyka.equalsIgnoreCase("Premiere")){
            price=12;
        }
        else if(cyka.equalsIgnoreCase("Normal")){
            price=7.5;
        }
        else if(cyka.equalsIgnoreCase("Discount")){
            price=5;
        }

        totalprice=totalprice*price;
        System.out.printf("%.2f",totalprice);

    }
}
