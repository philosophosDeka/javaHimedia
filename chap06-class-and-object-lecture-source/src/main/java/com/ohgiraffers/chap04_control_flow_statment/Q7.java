package com.ohgiraffers.chap04_control_flow_statment;

import java.util.*;

public class Q7 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int rdNum = random.nextInt(100) + 1;
//        System.out.println(rdNum);



        int count = 0;
        
        while(true) {
            System.out.print("정수 입력 : ");
            int num = sc.nextInt();
            if (0 < num && 101 > num) {
                if (num == rdNum) {
                    count++;
                    System.out.println("정답니다. " + count + "만에 정답을 맞추셨습니다.");
                    break;
                } else if (num < rdNum) {
                    count++;
                    System.out.println("입력하신 정수보다 큽니다.");
                    continue;
                } else {
                    count++;
                    System.out.println("입력하신 정수보다 작습니다.");
                    continue;
                }
            } else {
                System.out.println("1~100 사이의 수만 입력하세요.");
                System.out.println("카운터에서 제외");
            }

        }


    }
}
