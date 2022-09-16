package com.golfzonacademy.javastudy.boxing;

public class SameTypeOperation {
    public static void main(String[] args) {

        long t = System.currentTimeMillis();
        long sum = 0L;
        for (long i = 0; i < 1000000; i++) {
            sum += i;
        }
        System.out.println("실행시간 : " + (System.currentTimeMillis() - t) + " ms");
    }
}
// 실행시간 3ms

/*
 * 정리하자면 ... 100만건 데이터를 기준으로 약 5~6배의 성능 차이가 난다.
 * 따라서 서비스를 개발하면서 불필요한 오토 캐스팅이 일어나는지 확인하는 습관을 기르도록 하자.
 */
