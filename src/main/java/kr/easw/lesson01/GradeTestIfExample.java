package kr.easw.lesson01;


import java.util.Scanner;

// 입력된 점수에 따라 A, B, C, D, F 등급을 출력하는 예제입니다.
public class GradeTestIfExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("점수를 입력하세요 : ");
            // Scanner의 nextInt는 다음 문자열이 입력되어 Enter(\n) 키가 입력될 때까지 대기합니다.
            int score = scanner.nextInt();
            // 점수가 90점 이상이라면..
            if (score >= 90) {
                // A등급을 출력합니다.
                System.out.println("A");
                // 만약이 80점 이상이라면..
            } else if (score >= 80) {
                // B등급을 출력합니다.
                System.out.println("B");
                // 만약이 70점 이상이라면..
            } else if (score >= 70) {
                // C등급을 출력합니다.
                System.out.println("C");
                // 만약이 60점 이상이라면..
            } else if (score >= 60) {
                // D등급을 출력합니다.
                System.out.println("D");
                // 그것도 아니라면..
            } else {
                // F등급을 출력합니다.
                System.out.println("F");
            }
            // 이와 같이, else문을 중첩하여 사용함으로써 이전 조건이 맞지 않는다는 가정의 성립이 가능합니다.
        } catch (Exception ex) {
            // 입력된 값이 숫자가 아닐 경우 예외가 발생합니다.
            System.out.println("숫자가 아닙니다.");
        }
    }
}
