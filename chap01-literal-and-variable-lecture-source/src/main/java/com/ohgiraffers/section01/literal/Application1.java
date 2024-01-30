package com.ohgiraffers.section01.literal;

public class Application1 {

    public static void main(String[] args) {
        //System.out.println("Hello World");

        System.out.println(123);    //정수
        System.out.println(1.23);   //실수

        System.out.println('a');    //문자 형태의 값은 혼따옴표(single-quotation)으로 감싸줘야 한다.
//      System.out.println('ab');   //두 개 이상은 문자로 취급하지 않기 때문에 에러발생 -> 문자열 취급
//      System.out.println('');     //아무 문자도 기록되지 않은 공백상태에도 에러발생 -> 띄어쓰기 인식

        System.out.println('1');    //숫자 값이지만 혼따옴표로 감싸져 있을 경우 문자 '1'로 취급한다.

        System.out.println("안녕하세요");    //문자열은 문자 여러 개가 나열된 상태를 말하며 쌍따옴표(bouble-quotation)으로 감싸줘야 한다.
        System.out.println("123");         //정수이지만 쌍따옴표 안에 감싸줬기 때문에 문자열로 인식한다.
        System.out.println("");            //아무 값도 없는 공백이지만 문자열로 인식한다.
        System.out.println("a");           //한 개의 문자도 쌍따옴표로 감싸면 문자열로 인식한다. (문자 a와는 다르다.)

        System.out.println(true);
        System.out.println(false);         //true 혹은 false 값을 논리형이라고 한다.
    }
}
