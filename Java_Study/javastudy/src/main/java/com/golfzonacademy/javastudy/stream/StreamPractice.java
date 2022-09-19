package com.golfzonacademy.javastudy.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {

        // Collection으로부터 Stream 생성
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // 배열로부터 스트림 생성
        Stream<String> strStream = Stream.of("a", "b", "c");// 가변 인자
        Stream<String> strStream2 = Stream.of(new String[]{"a", "b", "c"});
        Stream<String> strStream3 = Arrays.stream(new String[]{"a", "b", "c"});
        Stream<String> strStream4 = Arrays.stream(new String[]{"a", "b", "c",}, 0, 3);

        // 특정 범위의 정수를 요소로 갖는 스트림 생성하기
        IntStream intStream = IntStream.range(1, 5); // 1, 2, 3 ,4
        IntStream intStream2 = IntStream.rangeClosed(1, 5); // 1,2,3,4,5



    }
}
