package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {

    public void simpleSwitchStatement() {

        /* [ switch문 표현식 ]
        *  switch(비교할 변수) {
        *       case 비교값1 : 비교할 변수의 값 == 비교값1인 경우 실행할 구문;
        *       break;
        *       case 비교값2 : 비교할 변수의 값 == 비교값2인 경우 실행할 구문;
        *       break;
        *       default : 위 case에 모두 해당하지 않는 경우 실행할 구문;
        *       break;
        *   }
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수: ");
        int fnum = sc.nextInt();
        System.out.print("두번째 정수: ");
        int snum = sc.nextInt();

        System.out.print("연산 기호(+, -, *, /, %) : ");
        char op = sc.next().charAt(0);

        /* 연산 결과를 저장할 변수 */
        int result = 0;

        switch (op) {
            case '+' :
                result = fnum + snum;
                break;
            case '-' :
                result = fnum - snum;
                break;
            case '*' :
                result = fnum * snum;
                break;
            case '/' :
                result = fnum / snum;
                break;
            case '%' :
                result = fnum % snum;
                break;
            default:
                System.out.println("잘못된 연산자를 입력하셨습니다.");
        }
        System.out.println(fnum + " " + op + " " + snum + " = " + result);
    }

    public void ohgiraffersVendingMachine() {

        /* <switch-case문> 이용 실습
        *  1. Scanner를 이용해 음료 이름(String)과 갯수(int)를 입력받는다.
        *  2. switch-case문을 사용해 전체 가격을 구한다.
        *  3. ['음료 이름' 을 '개수'개 선택하셨습니다. '가격'을 투입해주세요.
        *       위와 같이 출력되도록 한다.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("=============== Ohgiraffers Vending Machine ===============");
        System.out.println("코카콜라\t환타\t\t하늘보리\t핫식스");
        System.out.println("1,700\t1,200\t1,000\t2,000");
        System.out.println("===========================================================");
        
        // int cok = 1700;

        /* 총 가격을 담을 변수 */
        int price = 0;

        System.out.print("음료를 선택하세요 : ");
        String drink = sc.nextLine();
        System.out.print("개수 : ");
        int num = sc.nextInt();

        switch (drink) {
            case "코카콜라" :
                price = 1700 * num;
                break;
            case "환타" :
                price = 1200 * num;
                break;
            case "하늘보리" :
                price = 1000 * num;
                break;
            case "핫식스" :
                price = 2000 * num;
                break;
            default:
                System.out.println("없는 음료입니다.");
                return;
        }
        System.out.println(drink + ", " + num + "개를 선택하셨습니다. " +
                            price + "원을 투입해주세요.");

    }

}
