package ch15;

public class Audio implements RemoteControl{
    private int volume;
    private boolean mute;

    public void turnOn() {
        System.out.println("Audio ON");
    }
    public void turnOff() {
        System.out.println("Audio Off");
    }

    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("Current Audio volume : " + this.volume);
    }

    @Override
    public void setMute(boolean mute) {
        this.mute = mute;
        if (mute) {
            System.out.println("Audio mute ON");
        } else {
            System.out.println("Audio mute OFF");
        }
    }
}
