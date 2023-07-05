public class PerfectNumbers {
    public static void main(String[] args) {
        for (int i = 1; i<=100; i++){
            int count = 0;
            for (int j = 1; j<i; j++){
                //System.out.print(" i " + i + " " + " j " + j);
                if (i % j == 0){
                    //System.out.print(" i " + i + " j " + j);
                    count = count+j;

                }

            }
            System.out.println();
            if (count == i){
                System.out.println("perfect numbers" + i);
            }
        }


    }
}
