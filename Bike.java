package tdd;

public class Bike {
    private int accelerate;
    private int gear;
    private boolean isOn;



    public void increaseSpeed() {
        if(accelerate >=0 && accelerate <= 20){

            accelerate ++;
        } else if(accelerate >=21 && accelerate <=30) {
            accelerate = accelerate+2;
        } else if (accelerate >=31 && accelerate <= 40) {
            accelerate = accelerate+3;
        } else if (accelerate >= 41) {
            accelerate = accelerate+4;
        }

    }

    public void decreaseSpeed() {
        if(accelerate >=0 && accelerate <= 20){

            accelerate --;
        } else if(accelerate >=21 && accelerate <=30) {
            accelerate = accelerate-2;
        } else if (accelerate >=31 && accelerate <= 40) {
            accelerate = accelerate-3;
        } else if (accelerate >= 41) {
            accelerate = accelerate-4;
        }

    }

    public void setOn(){
        isOn = true;
    }

    public void setOff(){
        isOn = false;
    }

    public boolean isOn(){
        return isOn;
    }

    public int getGear(){
       if (isOn && accelerate >= 0 && accelerate<= 20){
           gear =1;
           return gear;
       } else if (isOn && accelerate >= 21 && accelerate <= 30) {
           gear = 2;
           return gear;
       }else if (isOn && accelerate >= 31 && accelerate <= 40) {
           gear =3;
           return gear;
       } else if (isOn && accelerate >= 41) {
           gear = 4;
           return  gear;
       }
       else return gear;
    }
    public int getSpeed() {
        if (isOn == false){
            accelerate = 0;
            return accelerate;
        } else if (isOn) {
            return accelerate;
        }else return accelerate;
    }
}
