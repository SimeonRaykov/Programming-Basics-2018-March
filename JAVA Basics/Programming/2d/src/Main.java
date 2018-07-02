import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Scanner= new Scanner(System.in);
String name1=Scanner.nextLine();
String name2=Scanner.nextLine();
if(name1.toLowerCase().equals(name2.toLowerCase())){


    System.out.println("yes");
}
else{
    System.out.println("no");
}
    }
}
