package com.ohgiraffers.chap04_control_flow_statment;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====== 판다 인사평가 ======");
        System.out.print("성실 : ");
        int diligent = sc.nextInt();
        System.out.print("서비스 : ");
        int service = sc.nextInt();
        System.out.print("미소 : ");
        int smile = sc.nextInt();

        int avg = (diligent + service + smile) / 3;

        //평균 점수가 60점 이상이면서 각 항목이 40점 이상인 조건이 만족
        if (diligent >= 40 && service >= 40 && smile >= 40 && avg >= 60) {
            System.out.println("합격입니다.");
        } else {
            if (diligent < 40) {
                System.out.println("성실 점수 미달로 불합격입니다.");
            }
            if(service < 40){
                System.out.println("서비스 점수 미달로 불합격입니다.");
            }
            if (smile < 40) {
                System.out.println("미소 점수 미달로 불합격입니다.");
            }
            if (avg < 60) {
                System.out.println("평균 점수 미달로 불합격입니다.");
            }
        }
    }
}
