package kr.easw.lesson01;


import java.util.Scanner;

// 입력된 점수에 따라 A, B, C, D, F 등급을 출력하는 예제입니다.
public class GradeTestIfExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("점수를 입력하세요 : ");
            int score = scanner.nextInt();
            if (score >= 90) {
                System.out.println("A");
            } else if (score >= 80) {
                System.out.println("B");
            } else if (score >= 70) {
                System.out.println("C");
            } else if (score >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        } catch (Exception ex) {
            System.out.println("숫자가 아닙니다.");
        }
    }
}
