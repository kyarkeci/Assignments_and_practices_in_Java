package tdd;

public class Minutes {
    private int seconds;
    private int days;
    private int years;





    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0){
            this.seconds = seconds * 60;
        }
    }



    public void setDays() {
        days = seconds/60/1440;

    }

    public int getYears() {
        return years;
    }

    public void setYears() {
        years = seconds/60/525600;
    }




}
