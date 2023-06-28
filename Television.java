package tdd;

public class Television {
    private boolean isOn;
    private int volume;
    private int channel;
    private boolean mute;

    public Television(){
        volume = 20;
        mute = false;
        isOn = false;

    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void increaseVolume(){
        volume++;
    }

    public void decreaseVolume(){
        volume--;
    }


    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void increaseChannel(){
        channel++;
    }

    public void decreaseChannel(){
        channel--;
    }


    public void setMute() {
        mute = !mute;
    }

    public boolean isMute() {
        return mute;
    }

    public void setOn() {
        isOn = !isOn;
    }


    public int getChannel() {
        return channel;
    }


    public int getVolume() {
        if (isOn == false){
            volume = 20;
            return volume;
        }else return volume;
    }

    public boolean isOn() {
        return isOn;
    }


}
