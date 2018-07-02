import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        double a = Double.parseDouble(Scanner.nextLine());
        String b = Scanner.nextLine();
        String c = Scanner.nextLine();
        if (b.equals("mm")) {
            a = a / 1000;
        }
        else if (b.equals("cm")){
            a=a/100;
        }
        else if (b.equals("mi")){
            a=a/0.000621371192;
        }
        else if (b.equals("in")){
            a=a/39.3700787;
        }
        else if (b.equals("km")){
            a=a/0.001;
        }
        else if (b.equals("ft")){
            a=a/3.2808399;
        }
        else if (b.equals("yd")){
            a=a/1.0936133;
        }
        if (c.equals("mm")) {
            a = a * 1000;
        }
        else if (c.equals("cm")){
            a=a*100;
        }
        else if (c.equals("mi")){
            a=a*0.000621371192;
        }
        else if (c.equals("in")){
            a=a*39.3700787;
        }
        else if (c.equals("km")){
            a=a*0.001;
        }
        else if (c.equals("ft")){
            a=a*3.2808399;
        }
        else if (c.equals("yd")){
            a=a*1.0936133;
        }

        System.out.printf("%.8f",a);
    }
}

