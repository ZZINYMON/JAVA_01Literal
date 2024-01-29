package com.ohgiraffers.Section01.literal;

public class Application01 {

    public static void main(String[] args) {

        //  주석  // ctrl + /
        /*  주석*/
        /*
         *
         *
         *
         *
         * */


        // 1. 숫자 형태의 값
        // 1-1. 정수 형태의 값 출력
        System.out.println(123);      // 123
        // 1-2. 실수 형태의 값 출력
        System.out.println(1.23);     // 1.23

        // 2. 문자 형태의 값 출력
        System.out.println('a');      // 문자 형태의 값을 ''로 감싸줘야한다.
        System.out.println('1');      // 숫자 값이지만 홑따옴표로 감싸져 있는 경우 문자 '1'이라고 판단한다.
//        System.out.println('ab');   // 두 개 이상은 문자로 취급하지 않기 때문에 에러 발생
        System.out.println("ab");     // 문자열은 ""
//        System.out.println('');     // 아무 문자도 기록되지 x -> error

        // 3. 문자열 형태의 값 출력
        System.out.println("ab");
        System.out.println("응애예요"); // 문자열은 문자 여러 개가 나열된 형태를 말하며, 쌍따옴표로 감싸줘야 한다.
        System.out.println("123");     // 정수 이지만 쌍따옴표로 감싸져있기 때문에 문자열로 보아야 한다.
        System.out.println("a"); // a  // 한 개의 문자도 쌍따옴표로 감싸면 문자열이다. (문자 a와는 다르다.)
            //System.out.println("a" + 1); => a1
        System.out.println('a'); //a
            //System.out.println('a' + 1); => 98

        // 4. 논리 형태의 값 출력
        System.out.println(true);
        System.out.println(false);      // true 혹은 false 값을 논리형이라고 한다.

       }
    }
    //// 대괄호(})가 아래에 두 개가 있는데 오류가 떠서 뭐가 문제인지 보니까 => foot1 대괄호에 주석이 달려있어서 인식이 안된 거였다.


