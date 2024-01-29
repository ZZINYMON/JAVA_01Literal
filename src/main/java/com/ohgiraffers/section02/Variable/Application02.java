package com.ohgiraffers.section02.Variable;

import java.io.LineNumberReader;

public class Application02 {

    public static void main(String[] args) {

        /* 수업목표. 변수를 선언하고 값을 할당하여 사용할 수 있다.
        필기. 변수를 사용하는 방법
        1. 변수를 준비한다. (선언)
        2. 변수에 값을 대입한다. (값 대입 및 초기화)
        3. 변수를 사용한다.

         */

        // 1. 변수를 준비한다. (선언)
        // 변수 선언 => 자료형 변수형;


        /*  필기
        * 자료형이란?
        * 다양한 값의 형태별로 어느 정도의 크기를 하나의 값으로 취급할 것인지 미리 Compiler와 약속한 키워드이다.
        * 예) 앞에서 사용한 int 자료형은 정수를 4byte만큼 읽어서 하나의 값으로 취급하겠다는 약속이다.
        *     이러한 자료형은 기본자료형(Primaru type)과 참조자료형(Reference type)으로 나누어진다.
        * 그 중 기본자료형 8가지부터 살펴보기로 한다.
         */

        // 숫자를 취급하는 자료형
        // 정수를 취급하는 자료형 4가지가 있다.

        byte brum ; // 1byte
        short snum ; // 2byte
        int inum ; // 4byte
        long lnum ; // 8byte


        // 실수를 취급하는 자료형 2가지가 있다.
        float frum ;
        double drum ;

        // 문자를 취급하는 자료형
         //문자를 취급하는 자료형

          char ch;; //2byte


        // 논리값을 취급하는 자료형
//        boolean brum ;



        // 정수를 취급하는 자료형에 값 대입
        brum = 1;
        snum = 2;
        inum = 4;
        lnum = 8; // 소문자 l로 써도 되지만 글꼴에 따라 1과 혼란이 빚어질 수 있어서 대문자로 하는 것이 권장이다.

        // 실수를 취급하는 자료형에 값 대입
        frum = 4.8f; // 실수 뒤에 f를 붙여야 한다. 대문자 F도 가능하지만 소문자를 사용하는 것이 일반적이다.
//        dnum = 8.8;

        // 문자를 취급하는 자료형에 값 대입
        ch = 'a';
//        ch2 = 97;

        // 논리를 취급하는 자료형에 값 대입
//        isTrue = true;
//        isTrue = false; //

        // 문자열을 취급하는 자료형에 값 대입
//        str = "안녕하세요";

        /* 변수를 선언하고 난 뒤 최초로 값이 대입되는 것을 초기화라고 한다.
        * 위에서는 변수 선언과 값 대입을 따로 했지만 동시에 수행할 수도 있다.
        * 명칭이 중요하지는 않지만 이것을 '선언과 동시에 초기화'라고 한다.

         */

        int point = 100;
        int bonus = 10;

        System.out.println("포인트와 보너스의 합은? : " );





























    }













}
