package tdd;

public class Clock {
    private String seconds;
    private String minutes;
    private String hours;
    private String time;



    public Clock(){
       seconds = 0 + " hours " + 0 + " minutes " +  "0  seconds";
       minutes = 0 + " hours " + 0 + " minutes " +   "0  seconds";
       hours = 0 + " hours " + 0 + " minutes " +   "0  seconds";
    }
    public void setSeconds(String seconds) {
        int sec = Integer.valueOf(seconds);
        if(sec >= 0 && sec <60) {
            this.seconds = 0 + " hours " + 0 + " minutes " + sec + " seconds";
        }
            if (sec>= 60 && sec < 3600){
                this.seconds = "0 hours " + sec/60 + " minutes "+ sec%60 + " seconds";
            } else if (sec >= 3600&&sec<86400) {
                this.seconds = sec/3600 + " hours " + (sec%3600)/60+" minutes  " + (sec%3600)%60 + " seconds";
            }

    }

    public String getSeconds() {
        return seconds;
    }


    public void setMinutes(String minutes) {
        int sec = Integer.valueOf(minutes);
       if (sec >= 0 && sec< 60){
           this.minutes = 0 + " hours " + sec + " minutes " + 0 + " seconds";
       }
       if (sec >=60){
           this.minutes = sec/60 + " hours " + sec%60+" minutes " + 0 + " seconds";
       }
    }

    public String getMinutes() {
        return minutes;
    }

    public void setHours(String hours) {
        int sec = Integer.valueOf(hours);
        if (sec >=0 && sec <24){
            this.hours = sec + " hours ";
        }
    }

    public String getHours() {
        return hours;
    }


}
