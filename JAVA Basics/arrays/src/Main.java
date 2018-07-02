import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
int n=Integer.parseInt(Scanner.nextLine());
        String[] names1=  new String[n];
        for (int i = 0; i <names1.length ; i++) {
            names1[i]=Scanner.nextLine();

        }
        while(true){
            String command=Scanner.next();
            if(command.equalsIgnoreCase("end")){
                break;
            }
                int i=Integer.parseInt(command);
            if(i<=0 || i>n){
                System.out.println("Invalid name");
                continue;
            }
            System.out.println(names1[i-1]);
        }

    }
}
