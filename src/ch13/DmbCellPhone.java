package ch13;

public class DmbCellPhone extends CellPhone{

    int channel;

    DmbCellPhone (String model, String color, int channel){
        this.model = model;
        this.color = color;
        this.channel = channel;
    }

    void turnOnDmb(){
        System.out.println("Channel " + channel + " Start");
    }
    void changeChannelDmb(int channel){
        this.channel = channel;
        System.out.println("Channel " + channel + " Change");
    }
    void turnOffDmb(){
        System.out.println("disconnect DMB");
    }
}
