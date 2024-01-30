package com.ohgiraffers.section01.literal;

public class Application2 {

    public static void main(String[] args) {

        /* 필기. 수학적으로 사용되는 사칙연산에 추가로 나머지를 구하는 연산(mod)을 사용할 수 있다. */
        System.out.println("======== 정수와 정수의 연산 ========");
        System.out.println(123 + 456);  //합
        System.out.println(123 - 23);   //차
        System.out.println(123 * 10);   //곱셈
        System.out.println(123 / 10);   //나눗셈
        System.out.println(123 % 10);   //나머지 값

        /* 필기. 실수끼리의 연산도 수학에서 사용하는 사칙연산에 나머지를 구하는 연산(mod)을 사용할 수 있다. */
        System.out.println("======== 실수와 실수의 연산 ========");
        System.out.println(1.23 + 1.23);    //합
        System.out.println(1.23 - 0.23);    //차
        System.out.println(1.23 * 10.0);    //곱
        System.out.println(1.23 / 10.0);    //나눗셈
        System.out.println(1.23 % 1.0);     //나머지 값 : 약간의 오차가 발생

        /* 필기. 정수와 실수 연산의 결과는 항상 실수가 나온다. */
        System.out.println("======== 정수와 실수의 연산 ========");
        System.out.println(123 + 0.5);  //합
        System.out.println(123 - 0.5);  //차
        System.out.println(123 * 0.5);  //곱셈
        System.out.println(123 / 0.5);  //나눗셈
        System.out.println(123 % 0.5);  //나머지 값

        /* 필기. 문자끼리의 연산도 사칙연산에 mod 연산까지 가능하다. */
        System.out.println("======== 문자와 문자의 연산 ========");
        System.out.println('a' + 'b');  //아스키 코드 a의 숫자값을 가져옴. a=97, b=98
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        /* 필기. 문자에 정수를 연산하는 것도 가능하다. */
        System.out.println("======== 문자와 정수의 연산 ========");
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 2);
        System.out.println('a' / 2);
        System.out.println('a' % 2);

        /* 필기. 실수도 숫자이기 때문에 정수의 연산처럼 모든 연산이 가능하다. */
        System.out.println("======== 문자와 실수의 연산 ========");
        System.out.println('a' + 1.0);
        System.out.println('a' - 1.0);
        System.out.println('a' * 2.0);
        System.out.println('a' / 2.0);
        System.out.println('a' % 2.0);

        /* 필기. 문자열과 문자열의 '+' 연산 결과는 문자열 합치기(이어붙이기)가 된다. */
        /* 필기. 문자열은 '+' 연산 외에 다른 연산을 사용하지 못한다. */
        System.out.println("======== 문자열과 문자열의 연산 ========");
        System.out.println("Hello" + "World");
//      System.out.println("Hello" - "World");
//      System.out.println("Hello" * "World");
//      System.out.println("Hello" / "World");
//      System.out.println("Hello" % "World");

        /* 필기. 문자열과 문자열의 '+' 연산 결과는 문자열 합치기(이어붙이기)가 된다. */
        /* 필기. 연산 결과는 다른 형태의 값들도 문자열로 취급하여 문자열 이어붙이기(문자열 합치기)결과가 된다. */
        System.out.println("======== 문자열과 다른 형태의 값 연산 ========");
        System.out.println("HelloWorld" + 123);         //문자열 + 정수 연산
        System.out.println("HelloWorld" + 123.456);     //문자열 + 실수 연산
        System.out.println("HelloWorld" + 'a');         //문자열 + 문자 연산
        System.out.println("HelloWorld" + true);        //문자열 + 논리 연산

        System.out.println("======== 문자열 형태의 숫자 '+' 연산 ========");
        System.out.println("123" + "456");

        /* 필기. 논리값끼리의 연산은 모든 연산자 사용이 불가능하다. */
//      System.out.println(true + false);
//      System.out.println(true - false);
//      System.out.println(true * false);
//      System.out.println(true / false);
//      System.out.println(true % false);

        /* 필기. 논리값과 정수의 연산은 모든 연산자 사용이 불가능하다. */
//      System.out.println(true + 1);
//      System.out.println(true - 1);
//      System.out.println(true * 1);
//      System.out.println(true / 1);
//      System.out.println(true % 1);

        /* 필기. 논리값과 실수의 연산은 모든 연산자 사용이 불가능하다. */
//      System.out.println(true + 1.0);
//      System.out.println(true - 1.0);
//      System.out.println(true * 2.0);
//      System.out.println(true / 2.0);
//      System.out.println(true % 2.0);

        /* 필기. 논리값과 문자의 연산은 모든 연산자 사용이 불가능하다. */
//      System.out.println(true + 'a');
//      System.out.println(true - 'a');
//      System.out.println(true * 'a');
//      System.out.println(true / 'a');
//      System.out.println(true % 'a');

        System.out.println("======== 논리와 문자열 연산 ========");
        System.out.println(true + "a");     //문자열 합치기 : true를 문자열로 인식.
//      System.out.println(true - "a");
//      System.out.println(true * "a");
//      System.out.println(true / "a");
//      System.out.println(true % "a");


    }
}
