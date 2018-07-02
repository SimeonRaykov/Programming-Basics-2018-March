package zad;

import java.util.Scanner;

public class Retirement {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
      try {
          String gender = Scanner.nextLine();


          int age = Integer.parseInt(Scanner.nextLine());
          int yearsWork = Integer.parseInt(Scanner.nextLine());


          if (gender.equals("male")) {
              int diffyears = Math.abs(age - 64);
              int diffwork = Math.abs(yearsWork - 38);
              if (yearsWork > age) {
                  System.out.printf("Invalid input.");
              } else {
                  if (age >= 64 && yearsWork >= 38) {
                      System.out.printf("Ready to retire at %d and %d years of experience!", age, yearsWork);
                  } else if (age < 64 && yearsWork >= 38) {
                      System.out.printf("Worked enough, but not old enough. Years left to retirement: %d.", diffyears);
                  } else if (age >= 64 && yearsWork < 38) {
                      System.out.printf("Old enough, but haven't worked enough. Work experience left to retirement: %d.", diffwork);
                  } else if (age < 64 && yearsWork < 38) {
                      System.out.printf("Too early. Years left to retirement: %d. Work experience left to retirement: %d.", diffyears, diffwork);
                  } else {
                      System.out.printf("Invalid input.");
                  }
              }
          } else if (gender.equals("female")) {
              int diffyears = Math.abs(age - 61);
              int diffwork = Math.abs(yearsWork - 35);
              if (age >= 61 && yearsWork >= 35) {
                  System.out.printf("Ready to retire at %s and %s years of experience!", age, yearsWork);
              } else if (yearsWork >= 35) {
                  System.out.printf("Worked enough, but not old enough. Years left to retirement: %d.", diffyears);
              } else if (age < 61 && yearsWork < 35) {
                  System.out.printf("Old enough, but haven't worked enough. Work experience left to retirement:%d", diffwork);
              } else if (age < 61 && yearsWork < 35) {
                  System.out.printf("Too early. Years left to retirement: %d. Work experience left to retirement:%d", diffyears, diffwork);
              } else {
                  System.out.printf("Invalid input.");
              }
          } else {
              System.out.printf("Invalid input.");
          }
      }catch(Exception e){
              System.out.print("Invalid input!");
          }
    }
}




