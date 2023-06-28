package tdd;

import java.security.SecureRandom;

public class DiceGame {
    private int dice1;
    private int dice2;
    private int count;
    private String win ;
    private int point;



    SecureRandom random = new SecureRandom();
    public void throw1stDice() {
        int face = 1 + random.nextInt(6);
        dice1 = face;
        count+=1;
    }
    public void throw2ndDice(){
        int face = 1 + random.nextInt(6);
        dice2 = face;
        count+=1;
    }

    public void getDiceThrown() {
        int sum = dice1 + dice2;
        if (count == 2 && sum == 7 || sum == 11){
            win = "you win!!";
        }
        if (count == 2 && sum == 2 || sum == 3 || sum == 12){
            win = "you lose";
        }
        if (count == 2 && sum ==4 || sum == 5 || sum == 6 || sum == 8 || sum == 9){
            point = sum;
        }
        if (count >= 4 && sum == point){
            win = "you win!!";
        }
        if (count >= 4 && sum == 7){
            win = "you lose";
        }

    }

    public String getWin() {
        System.out.printf("count : %d dice1 : %d dice2 : %d", count,dice1,dice2);
        return win;
    }

    public int getCount() {
        return count;
    }
}
