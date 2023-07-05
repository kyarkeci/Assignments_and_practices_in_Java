import java.security.SecureRandom;

public class Crabs {
    private static final SecureRandom random = new SecureRandom();
    private enum Status {CONTINUE, WON, LOST}
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        int myPoint = 0;
        Status status;
        int sumOfDice = throwDice();
        switch (sumOfDice){
            case SEVEN :
            case YO_LEVEN:
                status = Status.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                status = Status.LOST;
                break;
            default:
                status = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.println("my point is :" + myPoint);
                break;

        }
        while (status == Status.CONTINUE){
            sumOfDice = throwDice();
            if (sumOfDice == myPoint){
               status = Status.WON;
            } else if (sumOfDice == SEVEN) {
                status = Status.LOST;
            }


        }

        if (status == Status.WON){
            System.out.println("player wins");
        }else {
            if (status == Status.LOST){
                System.out.println("player loses");
            }
        }



    }
    public static int throwDice(){
        int dice1 = 1 + random.nextInt(6);
        int dice2 = 1 + random.nextInt(6);
        int sum = dice1 + dice2;
        System.out.println("player rolled " + dice1 + " + " + dice2 + " = " + sum);
        return sum;
    }
}
