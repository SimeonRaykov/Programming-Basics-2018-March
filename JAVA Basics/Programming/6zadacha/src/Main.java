import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
int a =Integer.parseInt(Scanner.nextLine());
 int sum =0;
while(a>0){
    sum+=a%10;
    a=a/10;

}
        System.out.println(sum);


}
        }





