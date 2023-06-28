import java.util.Scanner;

public class HighestNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("input num");
        boolean minMax = scanner.hasNextInt();
        if (minMax){
            int number = scanner.nextInt();
            int highestNumber = number;
            while (true){
                if (number > highestNumber){
                    highestNumber = number;
                }
                System.out.println("highestNumber in :" + highestNumber);
                System.out.println("input num");
                minMax = scanner.hasNextInt();
                if (minMax){
                    number = scanner.nextInt();
                }else {
                    break;
                }


            }
        }


    }
}
