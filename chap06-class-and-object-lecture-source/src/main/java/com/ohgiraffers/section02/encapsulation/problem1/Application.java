package com.ohgiraffers.section02.encapsulation.problem1;

public class Application {
    public static void main(String[] args) {

        Monster monster1 = new Monster();

        monster1.name = "두치";
        monster1.hp = 200;

        System.out.println("monstar1 name : " + monster1.name);
        System.out.println("monstar1 hp : " + monster1.hp);

        Monster monster2 = new Monster();

        monster2.name = "뿌꾸";
        monster2.hp = -200;

        System.out.println("monstar2 name : " + monster2.name);
        System.out.println("monstar2 hp : " + monster2.hp);

        Monster monster3 = new Monster();
        monster3.name = "드라큘라";
        monster3.setHp(-200);

        System.out.println("monstar3 name : " + monster3.name);
        System.out.println("monstar3 hp : " + monster3.hp);
    }
}
