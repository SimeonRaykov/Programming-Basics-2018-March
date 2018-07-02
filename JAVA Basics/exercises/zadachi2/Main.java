package zadachi2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);

        double students=Double.parseDouble(Scanner.nextLine());
        double poormark=0;
        double satisfactorymark=0;
        double goodmark=0;
        double verygoodmark=0;
        double excellentmark=0;

        for (int i = 0; i <students ; i++) {
            double points=Double.parseDouble(Scanner.nextLine());
if(points<=22.5){
    poormark++;
}
else if(points<=40.5){
    satisfactorymark++;
}
else if(points<=58.5){
    goodmark++;
}
else if(points<=76.5){
    verygoodmark++;
}
else if(points<=100){
    excellentmark++;
}


        }
        System.out.printf("%.2f%% poor marks%n",(poormark/students)*100);
        System.out.printf("%.2f%% satisfactory marks%n",satisfactorymark/students*100);
        System.out.printf("%.2f%% good marks%n",goodmark/students*100);
        System.out.printf("%.2f%% very good marks%n",(verygoodmark/students)*100);
        System.out.printf("%.2f%% excellent marks",(excellentmark/students)*100);
    }
}
