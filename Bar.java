public class Bar {
    public static void main(String[] args) {
        for (int i = 5; i <35 ;i+=5){
            //System.out.print(i);
            if (i >5){
                System.out.print(i-5+" ");
            }
            for (int j = 5; j<i; j++){
                System.out.print("*");
            }

            System.out.println(" ");


        }
    }
}
