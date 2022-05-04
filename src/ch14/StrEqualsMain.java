package ch14;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StrEqualsMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id = "PGRRR";
        String pwd = "123456789";

        System.out.println("id : ");
        String id_str = sc.next();

        System.out.println("pwd : ");
        String id_pwd = sc.next();

        if (id.equals(id_str) && pwd.equals(id_pwd)) {
            System.out.println("PASS");

        } else {
            System.out.println("FAIL");

        }
        sc.close();
    }
}
