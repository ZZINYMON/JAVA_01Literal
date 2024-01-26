package com.ohgiraffers.Section01.literal;

public class Application03 {


    public static void main(String[] args) {


        // 문자열 합치기 결과를 예측하고 사용할 수 있다.
        // 1. 두 개의 문자열 합치기
        System.out.println(9 + 9);
        System.out.println("9" + 9); //구구
        System.out.println(9 + "9"); //구구
        System.out.println("9" + "9"); // 문자열 9 + 문자열 9라서 = 구구라고 읽음 (구십구x)
        System.out.println('9' + '9'); // 문자9 => 아스키코드 9에 해당?
        System.out.println('9');


        // 2. 세 개의 문자열 합치기
        System.out.println("=============== 세 개의 문자열 합치기===============");
        System.out.println(9 + 9 + "9"); // 189 _ 숫자 사칙연산 앞에 있을 때는 가능
        System.out.println(9 + "9" + 9); //999
        System.out.println("9" + 9 + 9); // 999 _ 문자열 + 숫자 사칙연산 뒤에 있을 때는 사칙연산 x
        System.out.println("9" + (9 + 9)); // 918 _위의 경우 사칙연산 해주고 싶을 때는 사칙연산 할 숫자에 중괄호

        System.out.println("10과 20의 합 : " + (10 + 20));
        System.out.println("10과 20의 차 : " + (10 - 20));
        System.out.println("10과 20의 곱 : " + (10 * 20));
        System.out.println("10과 20의 나누기한 몫 : " + (10 / 20));
        System.out.println("10과 20의 나머지 : " + (10 % 20));

        System.out.println("기차");
        System.out.println("기차" + "칙칙폭폭");
        System.out.println("기차" + 123 + 45 + "출발");
        System.out.println("기차" + "123" + "45" + "출발");
        System.out.println("기차" + (123 + 45) + "출발");
        System.out.println(123 + 45 + "기차" + "출발");







































    }



















}
