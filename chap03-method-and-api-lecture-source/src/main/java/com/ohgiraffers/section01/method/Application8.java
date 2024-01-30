package com.ohgiraffers.section01.method;

public class Application8 {
    public static void main(String[] args) {

        /* static 메소드 호출
        *  static이 있는 메소드이든 non-static 메소드이든 동작 흐름은 동일하다.
        *
        *  static 메소드 호출 방법
        *  클래스명.메소드명();
        * */
        System.out.println("10과 20의 합: " + Application8.sumTwoNumbers(10, 20));

        /* 동일한 클래스 내에 작성된 static*/
        System.out.println("20과 30의 합: " + sumTwoNumbers(20, 30));
    }

    public static int sumTwoNumbers(int a, int b) {
        return a + b;
    }
}
