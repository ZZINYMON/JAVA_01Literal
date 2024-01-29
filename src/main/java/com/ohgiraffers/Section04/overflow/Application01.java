package com.ohgiraffers.Section04.overflow;

public class Application01 {

    public static void main(String[] args) {

        /* 수업목표. 오버플로우에 대해 이해할 수 있다. */
        /* 필기.
        *    자료형 별 값의 최대 범위를 벗어나는 경우
        * */

        /* 목차 1. 오버플로우 */
        byte num1 = 127;

        System.out.println("num1 : " + num1);

        num1++;     // 1을 증가

        System.out.println("num1 : " + num1);     // -128 : byte의 최소 저장 범위

        /* 목차2. 언더플로우 */
        byte num2 = -128;
        System.out.println("num2 : " + num2);

        num2--;     // 1 감소

        System.out.println("num2 : " + num2);     // 127 : byte의 최대 저장 범위

        // int형의 최대값은 대략 21억 정도이다.
        // 이 범위를 벗어난 계산은 오버플로우를 발생신켜 원하지 않는 결과값이 나오게 될 수 있다.
        int firstNum = 1000000; //100만
        int secondNum = 700000; //70만

        int multi = firstNum * secondNum;

        System.out.println("multi : " + multi);

        // 해결방법
        long longMulti = firstNum * secondNum;

        System.out.println("longMulti = " + longMulti);
        // 제대로 된 값이 출력되지 않은 이유 : 위에서 아래로 명령이 실행되는데 위에 이미 'int multi = firstNum * secondNum' 해놨기 때문

        // Real 해결방법
        long result = (long) firstNum * secondNum; // 앞에 범위가 더 넓은 (long) 붙혀주면 해결!

        System.out.println("result = " + result);















    }










}
