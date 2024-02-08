package com.ohgiraffers.section01.array;

public class Application4 {
    public static void main(String[] args) {

        /*
        * [카드뽑기]
        *  1. 문자열 배열에 SPADE, CLOVER, HEART, DIAMOND 를 저장
        *  2. 문자열 배열에 2, 3, 4, 5, 6, 7, 8, 9, 10, JACK, QUEEN, KING, ACE 를 저장
        *  3. 1번과 2번 배열의 길이에 맞도록 난수를 각각 발생
        *  4. 위에서 발생시킨 난수를 활용하여 카드를 출력
        *
        *  ====== 출력 예시 ======
        *  당신이 뽑은 카드는 DIAMOND 9 입니다.
        */

        String[] shape = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] number = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                            "JACK", "QUEEN", "KING", "ACE"};

        //shape[ ] Math.random() * 4
        int random1 = (int) (Math.random() * shape.length);
        int random2 = (int) (Math.random() * number.length);

        System.out.println("당신이 뽑은 카드는 " + shape[random1] + " " +
                            number[random2] + " 입니다.");
    }
}
