package tdd;

public class Aircondition {
    private boolean isOn;

    private String productName;

    private int temperature;


    public Aircondition(String productName){

        this.productName = productName;

    }

    public void decreaseTemperature(int temp){

        if(isOn == true){

            if(temperature - 1 >16){

                temperature =  temperature - temp;
            }

        }
    }

    public String getProductName(){

        return productName;
    }

    public int getTemperature(){

        return temperature;
    }

    public void increaseTemperature(int temp){

        if(isOn == true){

            if(temperature + 1 <30){

                temperature =  temperature + temp;
            }
        }

    }

    public boolean isOn(){

        return isOn;

    }

    public void setOn(){

        isOn = true;
    }

    public void setOff(){

        isOn = false;
    }



    public void setProductName(String productName){


    }

    public void setTemperature(int temperature){

        if(isOn == true){

            if(temperature > 14 && temperature <31){

                this.temperature = temperature;

            }

            else if(temperature <= 14){

                this.temperature = 15;

            }

            else{

                this.temperature = 30;

            }



        }

    }


}
