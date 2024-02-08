package com.ohgiraffers.section03.branching;

public class B_continue {

    public void testJumpContinue() {
        label1 :
        for (int dan = 2; dan < 10; dan++) {
            System.out.println("============" + dan + "단============");
            label2 :
            for (int su = 1; su < 10; su++) {
                if (su % 2 == 0) {
                    continue label1;
                }
                System.out.println(dan + " * " + su + " = " + (dan*su));
            }
            System.out.println();
        }
    }
}
