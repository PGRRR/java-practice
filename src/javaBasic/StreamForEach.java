package javaBasic;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamForEach {
    public static void main(String[] args) {
        String[] strings = {"one", "two", "three", "four", "five"};
        Stream.of(strings)
                .parallel()
                .forEach(System.out::println);
        boolean noEmptyStr = Stream.of(strings).noneMatch(s -> s.length() == 0);
        Optional<String> first = Stream.of(strings)
                .filter(s -> s.charAt(0) == 't')
                .findFirst();
        System.out.println(noEmptyStr);
        System.out.println(first.orElse("else"));
    }
}
