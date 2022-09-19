package com.golfzonacademy.javastudy.lambda;


import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExpressionPractice {

    public int sum(int a, int b) {
        return a + b;
    }
// sum method를 람다식으로 표현하면 (a,b) -> a + b; 로 나타낼 수 있다.

    Thread tread = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("Start Thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("End Thread");
        }
    });
//     Thread에서 실행할 코드를 구현


    Thread thread2 = new Thread(() -> {
        System.out.println("Start Thread");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End Thread");
    });

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Element1");
        list.add("Element2");
        list.add("Element3");

        list.forEach(x -> System.out.println(x));
        // 50번째줄 람다식은 list.forEach(System.out::println)으로 축약할 수도 있다.

        MySum func = (a, b) -> a + b;

        System.out.println(func.sum(10, 11));

//      Predicate 결합
        Predicate<Integer> greater = x -> x > 10;
        Predicate<Integer> less = x -> x < 20;

//      10 < x < 20 인지를 판단하는 Predicate 함수를 얻어낼 수 있다.
        Predicate between = greater.and(less);

//      isEqual() method는 Argument로 받은 객체와 같은지 판단해주는 새로운 함수를 만들어 준다.
        String name = "Choihanseong";
        Predicate<String> checkName = Predicate.isEqual(name);

        boolean isName = checkName.test(name);

//      method 참조
        Function<String, Integer> f = (String s) -> Integer.parseInt(s);

//      69번째 람다식을 다음과 같이 변경
        Function<String, Integer> f2 = Integer::parseInt;

//      두 개의 Argument를 입력으로 받는 BiFunction의 경우
        BiFunction<String, String, Boolean> bf = (s1, s2) -> s1.equals(s2);

//      76번째 람다식을 간략하게 표현해 보자 (::을 이용해서)
        BiFunction<String, String, Boolean> bf2 = String::equals;

//      마지막으로 이미 생성된 객체를 람다식에서 사용한 경우
        String obj = null;
        Function<String, Boolean> f3 = x -> obj.equals(x);

//      ::을 이용해서 줄여보자
        Function<String, Boolean> f4 = obj::equals;

//      생성자의 method 참조
        Supplier<LambdaExpressionPractice> s = () -> new LambdaExpressionPractice();
        Supplier<LambdaExpressionPractice> s1 = LambdaExpressionPractice::new;

//      하나의 인자를 받는 생성자의 경우
//      Function<Integer, TestClass> f5 = (i) -> new TestClass();
        Function<Integer, TestClass> f6 = TestClass::new;

//      ::을 이용하여 줄여보기
        BiFunction<Integer, String, TestClass> bf3 = (integer, string) -> new TestClass(integer, string);
        BiFunction<Integer, String, TestClass> bf4 = TestClass::new;

//      배열을 생성할 때
        Function<Integer, int[]> fArray = x -> new int[x];
        Function<Integer, int[]> fArray2 = int[]::new;


    }

    // 함수형 인터페이스를 정의하고 "FunctionalInterface" Annotation을 붙여주면 JavaCompiler가 함수형 인터터페이스의 정의를 검증해준다.
    @FunctionalInterface
    interface MySum {
        public int sum(int a, int b);
    }


}
