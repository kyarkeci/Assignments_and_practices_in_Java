package tdd;

public class Account {
    private int balance;
    private String pinNumber;

    public Account(String pinNumber) {
        if(pinNumber.length() == 4){
            this.pinNumber = pinNumber;
        }
    }


    public int getBalance(String pin) {
       if(pin == pinNumber && pin.matches("\\d+")){
           return balance;
       }
       else {return 0;}
    }

    public void deposit(int amount) {
        if(amount > 0) {
            balance = balance + amount;
        }
    }




    public void withdraw(int amount,String pin) {
        if(pin == pinNumber && pin.matches("\\d+")){
            if(amount <= balance){
                balance = balance-amount;
            }
        }
    }
}
