package javaBasic;

import java.util.stream.Stream;

public class StreamIterate {
    public static void main(String[] args) {
        Stream<Integer> iterate = Stream.iterate(0, n -> n + 2);
        iterate
                .limit(10)
                .forEach(System.out::println);
        Stream<Integer> generate = Stream.generate(() -> 1);
        generate
                .limit(10)
                .forEach(System.out::println);
    }
}
