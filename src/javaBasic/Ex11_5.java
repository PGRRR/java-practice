package javaBasic;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex11_5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }

        it = list.iterator();

        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
