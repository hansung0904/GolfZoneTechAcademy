package com.golfzonacademy.javastudy.boxing;

/*
 * Java에는 기본 타입과 Wrapper 클래스가 존재한다.
 * PrimitiveType : int, long, float, double, boolean 등
 * WrapperClass : Integer, Long, Float, Double, Boolean 등
 *
 * 박싱과 언박싱에 대한 개념을 먼저 살펴보자
 * Boxing : 기본 타입 데이터에 대응하는 Wrapper 클래스로 만드는 동작
 * Unboxing : Wrapper 클래스에서 기본 타입으로 변환
 */
public class BoxingAndUnBoxing {
    // Boxing
    int i = 10;
    Integer num = new Integer(i);

    // Unboxing
    Integer num2 = new Integer(10);
    int j = num2.intValue();


}
