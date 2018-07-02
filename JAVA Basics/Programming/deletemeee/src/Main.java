import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
double gosti = Double.parseDouble(Scanner.nextLine());
double budget=Double.parseDouble(Scanner.nextLine());
double kuvert=20;
double kuverttotal=20*gosti;
double moneyleft=budget-kuverttotal;
double moneyforfoierverki= moneyleft*0.4;
double donationmoney=moneyleft-moneyforfoierverki;
double nedostigashti=kuverttotal-budget;
if(budget>kuverttotal){
    System.out.printf("Yes!%.0f lv are for fireworks and %.0f lv are for donation.",moneyforfoierverki,donationmoney);
}
else{
    System.out.printf("They won't have enough money to pay the covert. They will need %.0f lv more.",nedostigashti);
}
    }
}