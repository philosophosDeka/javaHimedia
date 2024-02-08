package com.ohgiraffers.chap04_control_flow_statment;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====== 판다 급여 계산 ======");
        System.out.print("월 급여 : ");
        int salary = sc.nextInt();
        System.out.print("매출액 입력 : ");
        int sales = sc.nextInt();

        double bonus = 0;
        int totSalary = 0;

        if(sales >= 50000000) {
            bonus = 0.05;
        } else if(sales >= 30000000) {
            bonus = 0.03;
        } else if(sales >= 10000000) {
            bonus = 0.01;
        } else {
            bonus = 0;
        }

        totSalary = salary + (int)(sales * bonus);
        System.out.println("매출액 : " + sales);
        System.out.println("보너율 : " + (int)(bonus * 100) + "%");
        System.out.println("월 급여 : " + salary);
        System.out.println("보너스 금액 : " + (int)(sales * bonus));
        System.out.println("총 급여 : " + totSalary);
    }
}
