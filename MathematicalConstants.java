public class MathematicalConstants {
    public static void main(String[] args) {
        int pieDivisor = 5;
        double pieStarter = 4.0 - 4.0 / 3.0;
        int counter = 2;
        while (counter <=100){
            if (counter % 2 == 0){
                pieStarter = pieStarter + 4.0 / pieDivisor;
                System.out.println("counter" + " " + counter + " " + "pieStarter" + " " + pieStarter + " " + " pieDivisor " + " " + pieDivisor);
            }
            if (counter % 2 > 0){
                pieStarter = pieStarter - 4.0 / pieDivisor;
                System.out.println("counter" + " " + counter + " " + "pieStarter" + " " + pieStarter + " " + " pieDivisor " + " " + pieDivisor);
            }
            pieDivisor += 2;
            counter += 1;
        }
    }
}
