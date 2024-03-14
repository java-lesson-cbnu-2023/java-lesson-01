package kr.easw.lesson01;

import java.util.Scanner;

// 입력된 숫자를 짝수, 혹은 홀수로 판단하는 예제입니다.
public class OddEventIfExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 : ");
        try {
            // Scanner의 nextInt는 다음 문자열이 입력되어 Enter(\n) 키가 입력될 때까지 대기합니다.
            // 한 코드에서 멈추는 방식을 블로킹 방식이라고 부릅니다.
            int number = scanner.nextInt();
            // 입력된 숫자를 2로 나눈 나머지를 확인하여 짝수인지 홀수인지 판단합니다.
            if (number % 2 == 0) {
                System.out.println("짝수입니다.");
            } else {
                System.out.println("홀수입니다.");
            }
        } catch (Exception ex) {
            // 입력된 값이 숫자가 아닐 경우 예외가 발생합니다.
            // catch를 통해 예외를 처리합니다.
            System.out.println("숫자가 아닙니다.");
        }
        // return이 사용되지 않았을 경우, 구문은 끝가지 진행됩니다.
        System.out.println("프로그램을 종료합니다.");
    }
}
