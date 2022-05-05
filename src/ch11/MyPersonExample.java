package ch11;

public class MyPersonExample {
    public static void main(String[] args) {
        MyPerson p1 = new MyPerson("123456-1234567", "gen");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

//        p1.nation = "USA";
//        p1.ssn = "654321-7654321";
        p1.name = "moon";
    }
}
