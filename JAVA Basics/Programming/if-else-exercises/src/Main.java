import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int noshtuvki = Integer.parseInt(Scanner.nextLine());
        String destination = Scanner.nextLine();
        String transport = Scanner.nextLine();
        double cenavuzrastnihotel = 0;
        double cenavuzrastnitransport = 0;
        double cenadecahotel = 0;
        double cenadecatransport = 0;

        if (destination.equals("Miami")) {
            if (noshtuvki >= 1 && noshtuvki <= 10) {
                cenavuzrastnihotel = 24.99;
                cenadecahotel = 14.99;
            } else if (noshtuvki > 10 && noshtuvki <= 15) {
                cenavuzrastnihotel = 22.99;
                cenadecahotel = 11.99;
            } else if (noshtuvki > 15) {
                cenavuzrastnihotel = 20.00;
                cenadecahotel = 10.00;
            }
        }
        if (destination.equals("Canary Islands")) {
            if (noshtuvki >= 1 && noshtuvki <= 10) {
                cenavuzrastnihotel = 32.50;
                cenadecahotel = 28.50;
            } else if (noshtuvki > 10 && noshtuvki <= 15) {
                cenavuzrastnihotel = 30.50 ;
                cenadecahotel = 25.60;
            } else if (noshtuvki > 15) {
                cenavuzrastnihotel = 28.00;
                cenadecahotel = 22.00;
            }
        }
        if (destination.equals("Philippines")) {
            if (noshtuvki >= 1 && noshtuvki <= 10) {
                cenavuzrastnihotel = 42.99;
                cenadecahotel = 39.99;
            } else if (noshtuvki > 10 && noshtuvki <= 15) {
                cenavuzrastnihotel = 41.00;
                cenadecahotel = 36.00;
            } else if (noshtuvki > 15) {
                cenavuzrastnihotel = 38.50;
                cenadecahotel = 32.40;
            }
        }
        double cena1= ((cenadecahotel*3+cenavuzrastnihotel*2)*noshtuvki)*1.25;
        if(transport.equals("train")){
            cenavuzrastnitransport=22.30;
            cenadecatransport=12.50;
        }
        else if(transport.equals("bus")){
            cenavuzrastnitransport=45.00;
            cenadecatransport=37.00;
        }
        else if(transport.equals("airplane")){
            cenavuzrastnitransport=90.00;
            cenadecatransport=68.50;
        }
        double cenatotal= cena1+cenavuzrastnitransport*2+cenadecatransport*3;
        System.out.printf("%.3f",cenatotal);

    }
}
