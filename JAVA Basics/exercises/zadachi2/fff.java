package zadachi2;

import java.util.Scanner;

public class fff {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);

        double weight = Double.parseDouble(console.nextLine());
        String typeCourier = console.nextLine();
        int distance = Integer.parseInt(console.nextLine());

        double allPrice = 0.0;
        if (typeCourier.equals("standard")){
            if (weight < 1){
                allPrice = distance * 0.03;
            } else if (weight >=1 && weight <=10){
                allPrice = distance * 0.05;
            } else if (weight >=11 && weight <=40){
                allPrice = distance * 0.10;
            } else if (weight >= 41 && weight <=90){
                allPrice = distance *0.15;
            } else if (weight >= 91 && weight <=150){
                allPrice = distance * 0.20;
            }
        }
        else if (typeCourier.equals("express")){
            if (weight < 1){
                allPrice = distance * (0.03 + (0.03 * 0.8 * weight));
            } else if (weight >= 1 && weight <= 10){
                allPrice = distance * (0.05 + (0.05 * 0.4 * weight));
            } else if (weight >= 11 && weight <= 40){
                allPrice = distance * (0.10 + (0.10 * 0.05 * weight));
            } else if (weight >= 41 && weight <= 90){
                allPrice = distance * (0.15 + (0.15 * 0.02 * weight));
            } else if (weight >= 91 && weight <= 150){
                allPrice = distance * (0.20 + (0.20 * 0.01 * weight));
            }
        }

        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.",weight,allPrice);




    }
}
