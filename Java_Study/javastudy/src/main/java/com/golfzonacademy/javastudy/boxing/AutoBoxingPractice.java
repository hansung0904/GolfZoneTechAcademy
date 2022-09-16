package com.golfzonacademy.javastudy.boxing;

public class AutoBoxingPractice {
    public static void main(String[] args) {

        long t = System.currentTimeMillis();
        Long sum = 0L;
        for (long i = 0; i < 1000000; i++) {
            sum += i;
        }
        System.out.println("실행시간: " + (System.currentTimeMillis() - t) + " ms");
    }
}
// 실행시간 : 19 ms
