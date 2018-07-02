import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int n = Integer.parseInt(Scanner.nextLine());


 String names[]=new String[n];


        for (int i = 0; i <names.length ; i++) {
            names[i]=Scanner.nextLine();
        }


        while (true){
            String command=Scanner.next();
            if(command.equalsIgnoreCase("end")){
                break;
            }



            int i=Integer.parseInt(command);
            if(i<=0 || i>n){
                System.out.println("Invalid number");
                continue;
            }
            else{

            System.out.println(names[i-1]);}
        }





    }
}