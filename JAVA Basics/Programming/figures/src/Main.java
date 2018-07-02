import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int n = Integer.parseInt(Scanner.nextLine());
        int spaces = n - 2;
        int V = 1;
        int M=1;
        int H=2*n;
        int L=5;
        for (int i = 0; i < n -1; i++) {
            String spacesfirst = repeatStr(" ", spaces);
            spaces--;
            String spaces1 = repeatStr(" ", i);
            String firstrows = spacesfirst + "/" + spaces1 + "|" + "  " + "|" + spaces1 + "\\";

            System.out.println(firstrows);

        }
        String chertichki = "-";
        String secondpart = repeatStr("-", (n * 2 + 2));
        System.out.println(secondpart);


        for (int i = 0; i < (n/2)+5; i++) {
            String Middlerow = "|" + repeatStr(" ", n * 2) + "|";
            String spacemid2 = repeatStr(" ", n + 1);
            String spacemid1 = repeatStr(" ", (((n * 2) - (n + 1)) / 2) - 1);
            if (i == 0) {
                String mejdinen1 = "|" + spacemid1 + "_" + spacemid2 + "_" + spacemid1 + "|";
                System.out.println(mejdinen1);
            } else if (i == 1) {
                String mejdinen2 = "|" + spacemid1 + "@" + spacemid2 + "@" + spacemid1 + "|";
                System.out.println(mejdinen2);
            } else if (i == (n/2)+5-3 ){
                String spacesglava = repeatStr(" ", n - 1);
                String glava = "|" + spacesglava + "OO" + spacesglava + "|";
                System.out.println(glava);
            } else if (i == (n/2)+5-2) {
                String spacesrok = repeatStr(" ", n - 2);
                String vtr = "|" + spacesrok + "/" + "  " + "\\" + spacesrok + "|";
                System.out.println(vtr);
            } else if (i == (n/2)+5-1) {
                String spaceskrai = repeatStr(" ", n - 2);
                String K = "|" + spaceskrai + "||||" + spaceskrai + "|";
                System.out.println(K);
            } else {
                System.out.println(Middlerow);
            }


        }
        for (int i = 0; i < n + 1; i++) {
            String a = repeatStr("\\", V);
            V++;
            String b = repeatStr("`", H);
            H-=2;
            String c = repeatStr("/", M);
            M++;
            String OK = a + b + c;
            System.out.println(OK);

        }
    }

    static String repeatStr(String StringToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += StringToRepeat;
        }
        return text;


    }
}





