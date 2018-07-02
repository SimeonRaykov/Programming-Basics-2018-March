package zadachi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);

        int shirina=Integer.parseInt(Scanner.nextLine());
        int duljina=Integer.parseInt(Scanner.nextLine());
String a=Scanner.nextLine();

int torta=shirina*duljina;
int parche1=0;


        while(!a.equals("STOP")){
            int parche=Integer.parseInt(a);
            parche1+=parche;
            torta-=parche;
            if(torta<0) {
                break;
            }
     a=Scanner.nextLine();

        }

        if(torta>0){
            System.out.printf("%d pieces are left.",Math.abs(torta));
        }
        else{
            System.out.printf("No more cake left! You need %d pieces more.",Math.abs(torta));
        }







    }
}
