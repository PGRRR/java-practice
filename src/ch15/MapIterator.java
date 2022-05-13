package ch15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterator {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("School", "K-School");
        map.put("Major", "Computer");
        map.put("Grade", "Third");

        String key, value;
        System.out.println("iterator connect key");
        Iterator<String> keyIterator = map.keySet().iterator();
        while (keyIterator.hasNext()) {
            key = keyIterator.next();
            value = map.get(key);
            System.out.println(key + " : " + value);
        }
        System.out.println("\niterator connect value");
        Iterator<String> valueIterator = map.values().iterator();
        while (valueIterator.hasNext()) {
            System.out.println(valueIterator.next());
        }
    }
}
