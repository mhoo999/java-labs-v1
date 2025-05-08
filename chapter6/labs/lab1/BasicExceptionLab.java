package chapter6.labs.lab1;

import java.util.Scanner;

/**
 * Lab 1: 기본 예외처리
 * <p>
 * 사용자로부터 두 개의 숫자를 입력받아 나눗셈을 수행하는 프로그램입니다.
 * 0으로 나누기, 숫자가 아닌 입력 등의 예외 상황을 처리해야 합니다.
 */
public class BasicExceptionLab {
    public static void main(String[] args) {
        System.out.println("Lab 1: 기본 예외처리 실습");

        // TODO: Scanner 객체를 생성하세요.
        Scanner scanner = new Scanner(System.in);

        // TODO: try-catch-finally 구문을 작성하세요.
        // 1. 사용자로부터 두 개의 숫자를 입력받습니다.
        // 2. 첫 번째 숫자를 두 번째 숫자로 나눈 결과를 출력합니다.
        // 3. 다음 예외 상황을 처리하세요:
        //    - ArithmeticException: 0으로 나누려는 경우
        //    - NumberFormatException: 숫자가 아닌 값을 입력한 경우
        //    - 기타 예외: 기타 모든 예외 상황
        // 4. finally 블록에서 Scanner 객체를 닫고 프로그램 종료 메시지를 출력하세요.

        try {
            System.out.println("첫 번째 숫자를 입력하세요.");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println("입력한 숫자 : " + a);

            System.out.println("두 번째 숫자를 입력하세요.");
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println("입력한 숫자 : " + b);

            System.out.println(a + "를 " + b + "로 나눈 값은...");
            int c = a / b;
            System.out.println(c + "입니다.");

        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
            System.out.println("예외 메시지 : " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("숫자가 아닌 값을 입력할 수 없습니다.");
            System.out.println("예외 메시지 : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("예상치 못한 오류 발생");
            System.out.println("예외 메시지 : " + e.getMessage());
        } finally {
            System.out.println("시스템을 종료합니다.");
            scanner.close();
        }
    }
} 