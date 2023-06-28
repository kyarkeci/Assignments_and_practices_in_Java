import java.util.Scanner;

import java.util.Scanner;
public class Tutorial{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the monthly savings amount: ");
        int savings = 100;
        double month1 = savings * (1+ 0.00417);

        //System.out.println(month6);
        int counter = 1;
        //double mot2 = savings * (1+0.00417);

        while (counter <6){
            month1 = (month1 + savings) * (1+0.00417);
            counter++;
            //System.out.println(month1);
        }
        System.out.println("After the sixth month, the account value is $"+month1);



    }
}

