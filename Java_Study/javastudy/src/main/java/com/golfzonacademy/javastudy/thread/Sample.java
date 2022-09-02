package com.golfzonacademy.javastudy.thread;

public class Sample extends Thread {
    /*
        public void run() { // thread를 상속하면 run method를 먼저 구현해주어야 한다.
            System.out.println("thread.run");
        }

        public static void main(String[] args) {
            Sample sample = new Sample();
            sample.start();
        }

     */
    // thread가 동작할 수 있게 위의 예제 코드 수정
    int seq;

    public Sample(int seq) {
        this.seq = seq;
    }

    public void run() {
        System.out.println(this.seq + "thread start.."); // Thread가 시작됩니다.
        try {
            Thread.sleep(1000); // thread 1초대기

        } catch (Exception e) {

        }
        System.out.println(this.seq + "thread end"); // Thread 종료
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10 ; i++){ // 총 10개 쓰레드 생성해서 실행 -> MultiThread 구현의 아주 기본적인 방법
            Thread t = new Sample(i);
            t.start();
        }
        System.out.println("main end."); // main method 종료
    }


}
