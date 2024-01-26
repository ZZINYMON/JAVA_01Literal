package com.ohgiraffers.Section01.literal;

public class Application01 {

    public static void main(String[] args) {
        //  주석
        /*  주석*/
        /*
         *
         *
         *
         *
         * */

        /*

         */

        // 숫자 형태의 값
        // 정수 형태의 값 출력
        System.out.println(123); // 123

        //실수 형태의 값 출력
        System.out.println(1.23); //1.23

        //문자 형태의 값 출력
        System.out.println('a'); // 문자 형태의 값을 ''로 감싸줘야한다.
        System.out.println('1'); // 숫자 값이지만 홑따옴표로 감싸져 있는 경우 문자 '1'이라고 판단한다.
//        System.out.println('ab'); // 두 개 이상은 문자로 취급하지 않기 때문에 에러 발생
        System.out.println("ab");   // 문자열은 ""
//        System.out.println('');    // 아무 문자도 기록되지 x -> error

        // 문자열 형태의 값 출력
        System.out.println("ab"); //문자열은 문자 여러 개가 나열된 형태를 말하며
        System.out.println("응애예요");
        System.out.println("123");
        System.out.println("a"); // a
            //System.out.println("a" + 1); => a1
        System.out.println('a'); //a
            //System.out.println('a' + 1); => 98




        // 논리 형태의 값 출력
        System.out.println(true);
        System.out.println(false);

       }
    }
    //// 대괄호(})가 아래에 두 개가 있는데 오류가 떠서 뭐가 문제인지 보니까 => foot1 대괄호에 주석이 달려있어서 인식이 안된 거였다.


