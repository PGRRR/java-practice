package example_practice;

class MemberService {
    boolean login(String id, String password) {
        return id == "hong" && password == "12345";
    }

    void logout(String id) {
        System.out.println("logout");
    }
}

public class EALoginLogoutMethod0428 {
    public static void main(String[] args) {
        MemberService ms = new MemberService();
        boolean result = ms.login("hong", "12345");
        if (result) {
            System.out.println("log in");
            ms.logout("hong");
        } else {
            System.out.println("incorrect");
        }
    }
}
