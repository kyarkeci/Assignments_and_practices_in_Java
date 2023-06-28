import java.util.Scanner;

public class Play {
    public static void main(String[] args) {

        String separate = "7234";
        char char1 = separate.charAt(0);
        char char2 = separate.charAt(1);
        char char3 = separate.charAt(2);
        char char4 = separate.charAt(3);
        //char char5 = separate.charAt(4);
        int number1 = (Character.getNumericValue(char1)+7)%10;
        int number2 = (Character.getNumericValue(char2)+7)%10;
        int number3 = (Character.getNumericValue(char3)+7)%10;
        int number4 = (Character.getNumericValue(char4)+7)%10;
        //int number5 = Character.getNumericValue(char5);
        String password = number3 + ""+number4+""+number1+""+number2;
        //System.out.println(password);

        //int decrpt = Integer.parseInt(password);
        if (number1 >=0 && number1 <7){
            number1 = number1+10-7;
        }else {
            number1 = number1-7;
        }
        if (number2 >=0 && number2 <7){
            number2 = number2+10-7;
        }else {
            number2 = number2-7;
        }
        if (number3 >=0 && number3 < 7){
            number3 = number3+10-7;
        }else {
            number3 = number3 - 7;
        }
        if (number4 >=0 && number4< 7){
            number4 = number4 +10-7;
        }else {
            number4 = number4 -7;
        }
        System.out.printf("%d %d %d %d", number3,number4,number1,number2);






        String d = "";
        String e = "";
        String f = "";
        String g = "";
        String h = "";
        int count  = 1;
        while (count <= 4){
           int a = (int)Math.pow(1,count);
           int b =  (int)Math.pow(2,count);
           int c = (int)Math.pow(3,count);
           int w = (int)Math.pow(4,count);
           int p = (int)Math.pow(5,count);

            d = d + " " + a;
            e = e + " " + b;
            f = f + " " + c;
            g = g + " " + w;
            h = h + " " + p;



            count++;
           /* if (count == 5){
                System.out.println(d);
                System.out.println(e);
                System.out.println(f);
                System.out.println(g);
                System.out.println(h);


            } */
        }


        int invest = 1000;
        //double formular = 1;
        int counter = 1;
        while (counter <= 10){
           // System.out.println(invest *Math.pow((1+ 0.05),counter));
            counter++;
        }

        //System.out.printf("%s%-5s%n","year", "Amount on deposit");




        //System.out.println(char1 + " " + char2 + " " + char3 + " " + char4 + " " + char5 + " " + number3 + "" + password );


        Scanner scanner = new Scanner(System.in);
        System.out.println("input four digit pin");
        String input = scanner.next();
        while (input.length() != 5 || !input.matches("\\d+")){
            System.out.println("error enter new value");
            input = scanner.next();
        }
        String a = input.substring(0,1);
        String bb = input.substring(1,2);
        String cc = input.substring(2,3);
        String dd = input.substring(3,4);
        String ee = input.substring(4,5);




        int casing = 5;
        switch (casing){
            case 3:

            case 5:

            case 6:

            case 7:
                System.out.println("with God i can do all things");
                System.out.println("God is my fortress");
                System.out.println("God did it");
                System.out.println("i am big");
                break;
            default:
                System.out.println("no matter what rejoice");
        }


        int continu = 1;
        while (continu < 10){
            System.out.println(5560);
            System.out.println(4460);
            if (continu == 5) {
                continue; // skip remaining code in loop body if count is 5
            }
            System.out.println(44444);
            continu++;

        }








    }
}
