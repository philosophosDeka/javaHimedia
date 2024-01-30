package com.ohgiraffers.section01.method;

public class Application3 {
    public static void main(String[] args) {
        /* 전달인자(arguments)와 매개변수(parameter)를 이용한 메소드 호출 */

        /* 변수의 종류
        * 1. 지역변수
        * 2. 매개변수
        * 3. 전역변수(필드)
        * 4. 클래스(static)변수
        * */

        /* 지역변수는 선언한 메소드 블럭 내부에서만 사용 가능하다. 이것을 지역변수의 스코프라고 한다.
        *  다른 메소드 간 서로 공유해야 하는 값이 존재하는 경우 메소드 호출 시 사용하는 괄호를 이용해서 값을 전달할 수 있다.
        *  이 때 전달하는 값을 전달인자(argument)라고 부르고,
        *  메소드 선언부 괄호 안에 전달 인자를 받기 위해 선언하는 변수를 매개변수(parameter)라고 부른다. */

        Application3 app3 = new Application3();
        /* 전달인자와 매개변수를 이용한 메소드 호출 테스트 */
        app3.testMethod(26);
//        app3.testMethod("26");          //Error : 매개변수는 int형이지만 인자가 String형이기 때문
//        app3.testMethod(20, 30, 40);    //Error : 매개변수는 int 1개지만 인자는 3개이기 때문
//        app3.testMethod();              //Error : 매개변수는 선언되어 있지만 인자로 값을 전달하지 않기 때문

        int age2 = 20;
        app3.testMethod(age2);

        byte byteAge = 10;
        app3.testMethod(byteAge);          //자동형변환

        long longAge = 65;
//        app3.testMethod(longAge);        //자동형변환을 할 수 없어서 에러 발생
        app3.testMethod((int)longAge);     //강제형변환을 이용하여 자료형을 맞춘 후 호출(데이터 손실 주의)

        app3.testMethod(age2 * 4);

    }
    public void testMethod(int age) {
        System.out.println("당신의 나이는 " +  age + "세 입니다.");
    }
}
