package com.ohgiraffers.chap05_array;

import java.util.Arrays;
import java.util.Random;

public class Q3 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] lotto = new int[6];

        for (int i = 0; i < 6; i++) {
            lotto[i] = new Random().nextInt(45) + 1;
            for (int j = 0; j < i; j++) {
                if(lotto[i] == lotto[j]) {  //중복체크
                    i--;
                }
            }
            System.out.print(lotto[i] + " ");
        }
        // 배열을 오름차순 정렬
        Arrays.sort(lotto);

        // 정렬된 배열 출력
        System.out.print("\n정렬된 로또 번호: ");
        for (int number : lotto) {
            System.out.print(number + " ");
        }
    }
}
