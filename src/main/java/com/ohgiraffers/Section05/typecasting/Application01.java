package com.ohgiraffers.Section05.typecasting;

public class Application01 {

    public static void main(String[] args) {

        /* 수업 목표. 자동 형변환 규칙에 대해 이해할 수 있다. */

        /* 필기.
        * 데이터 형변환
        * 데이터 형변환이 필요한 이유
        * - 자바에서 다른 타입끼리의 연산은 피연산자들이 모두 같은 타입인 경우 실행할 수 있다.
        * - 즉, 같은 데이터 타입끼리만 연산을 수행할 수 있다.
         */

        /* 필기.
        * 형변환의 종류와 규칙
        * 1. 자동형변환(묵시적 형변환) : 컴파일러가 자동으로 수행해주는 타입 변환
        *  1-1. 작은 자료형에서 큰 자료형은 자동 형변환 된다.
        *  1-2. 정수는 실수로 자동 형변환 된다.
        *  1-3. 문자형은 int형으로 자동 형변환 된다.
        *  1-4. 논리형은 형변환 규칙에서 제외된다.
        * 2. 강제형변환(명시적 형변환) : 형변환(cast) 연산자를 이용한 강제적으로 수행하는 형변환
        *  2-1. 자동형변환이 적용되지 않는 경우 강제 형변환이 필요하다.
        *  */

        /* 목차 1. 자동형변환 규칙 테스트 */
        /* 목차 1-1. 작은 자료형에서 큰 자료형으로는 자동 형변환 된다. */
        /* 필기. 작은 자료형에서 큰 자료형으로 공간만 옮기는 경우
                데이터 손실이 발생하지 않기 때문에 컴파일러가 자동으로 처리해준다. */

        /* 목차 1-1-1. 정수끼리의 자동 형변환 */
         byte bnum = 1;
         short snum = bnum;
         int inum = snum;
         long lnum = inum;

         int num1 = 10;
         long num2 = 20;

//         int result = num1 + num2; // 자동으로 큰 쪽 자료형인 long으로 변경 후 계산하기 때문에 int형 변수에 값을 담을 수 없다.
        long result = num1 + num2; // int + long은 서로 다른 자료형이라 데이터 손실이 발생하지 않는 int -> long 변환을 자동 수행 후 연산한다.

        System.out.println("result = " + result);

        /* 목차 1-1-2. 실수 끼리의 자동 형변환 */
        float frum = 4.8f;
        double drum = frum;

        double result2 = frum + drum;

        /* 목차 1-2. 정수는 실수로 자동 형변환 된다. */
        long lnum2 = 8;
        float frum2 = lnum2;

        /* 목차 1-3. 문자형은 int형으로 자동 형변환 된다. */
        char ch1 = 'a';
        int charNumber = ch1;

        System.out.println("charNumber : " + charNumber);

        /* 목차 1-4.















    }














}
