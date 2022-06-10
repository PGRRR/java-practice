package javaBasic;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> optionalS = Optional.empty();
//        Optional<String> optionalS = Optional.of("abc");
        System.out.println(optionalS.orElse("else"));
//        System.out.println(optionalS.orElseGet(()->new String()));
        System.out.println(optionalS.orElseGet(String::new));
//        String str = "";
//        try {
//            str = optionalS.get();
//        } catch (Exception e) {
//            str = "";
//        }
//        System.out.println(str);
    }
}
