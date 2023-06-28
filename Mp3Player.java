package tdd;

public class Mp3Player {
    private int volume;
    private boolean isPlaying;
    private int batteryLevel;
    private int playlist;
    private String songList;
    private String playing;
    private boolean isPause;
    private boolean isOn;


    public Mp3Player(){
        playlist = 1;
        isOn = false;
        isPlaying = true;
        isPause = false;
        batteryLevel = 70;
    }

    public void toggleOnOff() {
        isOn = !isOn;
    }

    public void setSongList(){
        switch(playlist){
            case 1:
                songList = "Damages\n" +
                        "Single • Tems\n";
                break;
            case 2:
                songList = "White Iverson\n" +
                        "Song • Post Malone";
                break;
            case 3:
                songList = "Try Me\n" +
                        "Single • Tems";
                break;
            case 4:
                songList = "Bibanke\n" +
                        "Song • Asa\n";
                break;
            case 5:
                songList = "Awe\n" +
                        "Song • Asa\n";
                break;
            case 6:
                songList = "I Will Pray\n" +
                        "Song • Ebuka Songs\n";
                break;
            case 7:
                songList = "Forever (Live)\n" +
                        "Song • Kari Jobe\n";
                break;
            case 8:
                songList = "Graves Into Gardens\n" +
                        "Brandon Lake & Elevation Worship";
                break;
            case 9:
                songList = "Fear is Not My Future (feat. Tasha Cobbs Leonard)\n" +
                        "Song • Todd Galberth\n";
                break;
            case 10:
                songList = "The Blessing (Live)\n" +
                        "Song • Kari Jobe, Cody Carnes & Elevation Worship\n";
                break;
            case 11 :
                songList = "Imela (feat. Enitan Adaba)\n" +
                        "Song • NATHANIEL BASSEY\n";
                break;
            case 12 :
                songList = "Looku Looku\n" +
                        "Song • Tems";
                break;
            case 13 :
                songList = "Daddy wey dey Pamper (feat. Lyrical HI)\n" +
                        "Song • Moses Bliss\n";
                break;
            default:
                songList = null;

        }
    }

    public String getSongList() {
        return songList;
    }



    public boolean isPause() {
        return isPause;
    }

    public void setPause() {
        isPause = !isPause;
    }

    public void increaseVolume(){
        volume ++;
    }

    public void decreaseVolume(){
        volume--;
    }


    public int getBatteryLevel() {

            return batteryLevel;
    }

    public int getVolume() {
        if (batteryLevel == 0 || isOn == false || isPause == true ){
            volume = 0;
            return volume;
        }
        else {
            return volume;
        }
    }

    public boolean isOn() {
        if (batteryLevel == 0){
            isOn = false;
            return isOn;
        }
        else {
            return isOn;
        }
    }

    public void setPlaylist(int songs) {
        if (songs > 0 && songs <=13){
            this.playlist = songs;
        }
    }

    public void nextPlaylist(){
        playlist = playlist+1;
    }

    public void previousPlaylist(){
        playlist = playlist-1;
    }

    public int getPlaylist (){
       if (playlist >= 0 && playlist <14){
           return playlist;
       }
       else {
           return playlist;
       }
    }



    public boolean isPlaying() {
        if (batteryLevel == 0 || isOn == false || isPause == true ){
            isPlaying = false;
            return isPlaying;
        }
        else {
            return isPlaying;
        }
    }
}
