public class TV implements CanOnOff,CanChangeChannel,CanChangeVolume{
    boolean IsOn;
    int channel = 1;
    int volume;
    public TV(boolean IsOn){
        this.IsOn = IsOn;
        this.channel = channel;
        this.volume = volume;
    }

    public void on(){
        this.IsOn = true;
    }

    public void off(){
        this.IsOn = false;
    }

    public void channelUp(){
        if (this.channel > 0 && this.channel < 99 && this.IsOn == true){
        this.channel +=1;
    }
    }

    public void channelDown(){
        if (this.channel > 1 && this.channel < 99 && this.IsOn == true){
        this.channel -=1;
    }
    }

    public void setChannel(int n){
        if (this.IsOn == true  && n>0 && n<99){
        this.channel = n;
    }
    }

    public String status(){
        if (this.IsOn == true){
            return "Is on"+" Channel number: "+this.channel+" Volume is: "+this.volume;
        }
        else{
            return "Is off";
        }
    }

    public void volumeUp(){
        this.volume+=1;
    }

    public void volumeDown(){
        this.volume-=1;
    }
    public static void main(String[] args) {
        TV tv =new TV(true);
        System.out.println(tv.status());
        tv.volumeUp();
        tv.channelUp();
        System.out.println(tv.status());
        tv.channelDown();
        tv.volumeDown();
        System.out.println(tv.status());
        tv.setChannel(100);
        System.out.println(tv.status());
        tv.off();
        System.out.println(tv.status());
    }
}
