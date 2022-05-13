package phone_number_manager;

import java.util.Scanner;

public class PhoneInfo {
    private String name;
    private String phoneNumber;
    private String birthday;

    PhoneInfo() {
    }

    public PhoneInfo(String name, String phoneNumber, String birthday) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
    }

    public PhoneInfo(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void printPhoneInfo() {
        System.out.println(name);
        System.out.println(phoneNumber);
        if (!(birthday == null)) {
            System.out.println(birthday);
        }
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public static void main(String[] args) {
//        PhoneInfo pi = new PhoneInfo("Lee","010","119");
//        PhoneInfo pi2 = new PhoneInfo("Lee","010");
//        pi.printPhoneInfo();
//        pi2.printPhoneInfo();
        Scanner sc = new Scanner(System.in);
        int chooseNum;
        do {
            System.out.println("Choose menu");
            System.out.println("1. Data input");
            System.out.println("2. Program exit");
            System.out.print("Choose : ");
            chooseNum = sc.nextInt();
            if (chooseNum == 1) {
                System.out.print("Name : ");
                String name = sc.next();
                System.out.print("Phone Number : ");
                String phoneNum = sc.next();
                System.out.print("Birthday : ");
                String birthNum = sc.next();
                System.out.println("\nInput info print");
                PhoneInfo pi = new PhoneInfo(name, phoneNum, birthNum);
                pi.printPhoneInfo();
            } else {
                break;
            }
        }
        while (true);
    }
}
