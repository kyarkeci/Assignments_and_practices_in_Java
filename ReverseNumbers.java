public class ReverseNumbers {
    public static void main(String[] args) {

        String reversed = "";
       int numbers = 345600075;
       while (numbers > 0){
           int reverse = numbers%10;
           reversed = reversed + reverse;
           numbers = numbers /10;

       }
        System.out.println(reversed);

    }
}
