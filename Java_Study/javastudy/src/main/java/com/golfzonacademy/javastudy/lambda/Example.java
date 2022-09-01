package com.golfzonacademy.javastudy.lambda;

import java.util.function.Function;
import java.util.function.Supplier;

public class Example {
    // 변수의 섀도잉
    int number = 0;
    private String name = "Choi";

    public Supplier<Integer> getFunction1() {
        return () -> number * 10;
    }

    public Supplier<Integer> getFunction2() {
        return () -> number * 10;
    }

    public Supplier<Integer> getFunction3() {
        int number = 20;
        return () -> number * 10;
    }

    public Supplier<String> getNameFunction() {
        Supplier<String> getNamer = new Supplier<String>() {
            private String name;

            @Override
            public String get() {
                return this.name;
            }
        };
        return getNamer;
    }


    // 변수의 범위
    public static Function<String, String> getFunction(String str) {
        return (x) -> x.concat(str);
    }

    public static void main(String[] args) {
        Function<String, String> getContent = getFunction("_suffix");

        System.out.println(getContent.apply("name"));
    }

}
