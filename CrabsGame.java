import java.security.SecureRandom;
import java.util.Scanner;

public class CrabsGame {
private static final Scanner scanner = new Scanner(System.in);
private static final SecureRandom random = new SecureRandom();
private enum Status {CONTINUE, WON, LOST};
private static int point;
    public static void main(String[] args) {
       Status firstThrow = firstThrow();
        System.out.println(firstThrow);
       while (firstThrow == Status.CONTINUE){
         firstThrow = anotherThrow();

       }


    }
    public static int rollDice(){
        int dice1 = 1 + random.nextInt(6);
        int dice2 = 1 + random.nextInt(6);
        int sum = dice1+dice2;
        System.out.println("dice1 : " + dice1 + " + " + " dice2 : " + dice2 + " = " + " sum : " + sum);
        return sum;

    }
    public static Status firstThrow(){
        Status status = Status.CONTINUE;
        int firstThrow = rollDice();
        if (firstThrow == 7 || firstThrow == 11){
            System.out.println(firstThrow);
            //System.out.println(Status.WON);
            status = Status.WON;

        } else if (firstThrow == 2 || firstThrow == 3 || firstThrow == 12) {
            System.out.println(firstThrow);
            //System.out.println(Status.LOST);
            status = Status.LOST;
        }

        if (firstThrow == 4 || firstThrow == 5 || firstThrow == 6 || firstThrow == 8 || firstThrow == 9 || firstThrow == 10){
            point = firstThrow;
            System.out.println("your point is : " + point + " throw again!! ");
        }
        return status;

    }
    public static Status anotherThrow(){
        Status status = Status.CONTINUE;
        int anotherThrow = rollDice();
        if (anotherThrow == point){
            System.out.println(anotherThrow);
            System.out.println(Status.WON);
            status = Status.WON;
        } else if (anotherThrow == 7) {
            System.out.println(anotherThrow);
            System.out.println(Status.LOST);
            status = Status.LOST;
        }else {
            System.out.println("throw again!!");
        }
        return status;
    }

}
