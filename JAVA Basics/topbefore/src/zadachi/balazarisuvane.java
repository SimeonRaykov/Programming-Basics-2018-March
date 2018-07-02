package zadachi;

import java.util.Scanner;

public class balazarisuvane {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
int n=Integer.parseInt(Scanner.nextLine());
int height=2*n+1;
int width=2*n+3;
int m=n;

//Top
        for (int i = 0; i <n-1 ; i++) {
            String dots=repeatStr(".",i);
            String top="";
            String dots1=repeatStr(".",n-i);

            top+=dots+"*"+dots1+"*"+dots1+"*"+dots;
            System.out.println(top);
        }

        //Mid1
        String Mid1="";
        String bots=repeatStr(".",n-1);
        Mid1+=bots+"*****"+bots;
        System.out.println(Mid1);

//Mid2
String Mid2=""+
repeatStr("*",width);
        System.out.println(Mid2);

        //Mid3
        System.out.println(Mid1);


       //Bottom
        for (int i = 0; i <n-1 ; i++) {
            String bottom="";
            String dots=repeatStr(".",n-2-i);
String dots1=repeatStr(".",2+i);
bottom+=dots+"*"+dots1+"*"+dots1+"*"+dots;

            System.out.println(bottom);
        }




    }
        static String repeatStr (String StringToRepeat,int count){
            String text = "";
            for (int i = 0; i < count; i++) {
                text += StringToRepeat;
            }
            return text;

        }
    }

