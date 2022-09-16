package com.golfzonacademy.javastudy.boxing;

/*
 * 오토박싱 & 언박싱
 * JDK 1.5 부터는 자바 컴파일러가 박싱과 언박싱이 필요한 상황에 자동으로 처리를 해준다.
 * 성능 : 편의성을 위해서 오토 박싱과 언박싱이 제공되고 있지만, 내부적으로 추가 연산 작업이 거치게 된다.
 *       따라서, 오토박싱 & 언박싱이 일어나지 않도록 동일한 타입 연산이 이루어지도록 구현해보자.
 * */
public class AutoBoxingAndAutoUnBoxing {

    // 오토박싱
    int i = 10;
    Integer num = i;

    // 오토 언박싱
    Integer num2 = new Integer(10);
    int j = num2;
}
