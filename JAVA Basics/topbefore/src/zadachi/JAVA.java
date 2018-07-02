package zadachi;

import java.util.Scanner;

public class JAVA {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int n = Integer.parseInt(Scanner.nextLine());
int height=3*n+1;
int width=3*n+6;



//Top
        for (int i = 0; i <n ; i++) {
String Top="";
String alfa=repeatStr("~ ",3);
String spaces=repeatStr(" ",n);
Top+=spaces+alfa;
            System.out.println(Top);


        }


        //Mid
        String Mid="";
        Mid+=repeatStr("=",width-1);
        System.out.println(Mid);

//Mid1
        for (int i = 0; i <n-2 ; i++) {
            String Mid1="";
String beta=repeatStr("~",width-3-(n-1));
String spaces=repeatStr(" ",n-1);
            Mid1+="|"+beta+"|"+spaces+"|";
            String beta1=repeatStr("~",n);
            String Mid1_="|"+beta1+"JAVA"+beta1+"|"+spaces+"|";
            if(i==n/2-1){
                System.out.println(Mid1_);
            }else{
                System.out.println(Mid1);
            }


        }

        //Mid2
        System.out.println(Mid);

//Bottom
        for (int i = 0; i < n; i++) {

            String bot="";
            String spaces=repeatStr(" ",i);
            String klomba=repeatStr("@",n*2+4-(2*i));
bot+=spaces+"\\"+klomba+"/";
            System.out.println(bot);
        }



        //Final
        String stop=repeatStr("=",2*n+6);
        System.out.println(stop);

    }
        static String repeatStr (String StringToRepeat,int count){
            String text = "";
            for (int i = 0; i < count; i++) {
                text += StringToRepeat;
            }
            return text;

        }

    }

