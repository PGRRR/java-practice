package javaBasic;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTestList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> intStream = list.stream(); // list를 데이터 소스로 하는 새로운 스트림을 생성
        intStream.forEach(System.out::print); // forEach() 최종 연산

        // stream 은 1회용 stream 에 대해 최종 연산을 수행하면 stream 이 닫힌다.
        intStream = list.stream(); // list 로부터 stream 생성
        intStream.forEach(System.out::print);

        Stream<String> stringStream = Stream.of("a", "b");
        IntStream intStream1 = IntStream.of(1, 2, 3);
        IntStream intStream2 = Arrays.stream(new int[]{1, 2, 3});
        IntStream intStream3 = Arrays.stream(new int[]{1, 2, 3},0,1);
        intStream2.forEach(System.out::println);
        System.out.println(intStream1.sum());

        IntStream intStream4 = new Random().ints(10,5,10);
        intStream4
//                .limit(10)
                .forEach(System.out::println);
    }
}
