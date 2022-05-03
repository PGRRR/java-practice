package ch13;

public class DmbCellPhoneExample {
    public static void main(String[] args) {
        DmbCellPhone dmbCellPhone = new DmbCellPhone("apple", "black", 10);

        System.out.println("model: " + dmbCellPhone.model);
        System.out.println("color: " + dmbCellPhone.color);

        System.out.println("channel: " + dmbCellPhone.channel);

        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("Hello");
        dmbCellPhone.receiveVoice("Hi, I`m Lee");
        dmbCellPhone.sendVoice("Nice to meet you");
        dmbCellPhone.hangUp();

        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(12);
        dmbCellPhone.turnOffDmb();

    }
}
