package ch17;

public class SwitchTest {
    public static void main(String[] args) {
        String ssn = "010624-1230123";
        char sex = ssn.charAt(7);
        switch (sex) {
            case '1':
            case '3':
                System.out.println("Man");
                break;
            case '2':
            case '4':
                System.out.println("Woman");
                break;
        }
    }
}