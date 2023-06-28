import java.util.Scanner;

public class SeparateNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("input numbers");
        int numbers = scanner.nextInt();
        while(numbers > 0){
            int separate = numbers %10;
            if(separate == 7){
                count++;
            }
            numbers = numbers/10;
            System.out.println(separate);
        }



    }
}
