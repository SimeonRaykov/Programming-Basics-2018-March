package zad;

import java.util.Scanner;

public class Holiday {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);

int neighbourscount=Integer.parseInt(Scanner.nextLine());
int budget=Integer.parseInt(Scanner.nextLine());


int kuvert=20*neighbourscount;
int nedostigashti=kuvert-budget;
if(kuvert>budget){
    System.out.printf("They won't have enough money to pay the covert. They will need %s lv more.",nedostigashti);
}
else if(kuvert<budget){
    int remainingmoney=budget-kuvert;
    int moneyforF= ((int)(remainingmoney*0.4));
    int moneyforD=remainingmoney-moneyforF;
    System.out.printf("Yes! %s lv are for fireworks and %s lv are for donation.",moneyforF,moneyforD);
}


    }
}
