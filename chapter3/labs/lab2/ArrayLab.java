package chapter3.labs.lab2;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 배열 활용하기 실습
 */
public class ArrayLab {
    public static <string> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. 정수형 배열 활용
        System.out.println("===== 정수형 배열 활용 =====");
        
        // TODO: 5개의 정수를 입력받아 배열에 저장하고, 합계와 평균을 계산하여 출력하세요.
        // 힌트: Scanner를 이용하여 사용자로부터 입력을 받으세요.
//        System.out.println("배열 갯수 입력");
//        int x = scanner.nextInt();
//        int[] numbers = new int[x];
//
//        for (int i = 0; i < x; ++i) {
//            System.out.println((i+1) + "번째 숫자 입력");
//            int y = scanner.nextInt();
//            numbers[i] = y;
//        }
//
//        System.out.println("numbers 합계 : " + Arrays.stream(numbers).sum());
//        System.out.println("numbers 평균 : " + Arrays.stream(numbers).average());
        
        // 2. 문자열 배열 활용
        System.out.println("\n===== 문자열 배열 활용 =====");
        
        // TODO: 5개의 이름을 입력받아 배열에 저장하고, 특정 문자(예: 'A')로 시작하는 이름을 검색하여 출력하세요.
        // 힌트: String 클래스의 startsWith() 또는 charAt() 메소드를 활용하세요.
//        String[] strings = new String[5];
//        System.out.println("이름 5개 입력");
//        for (int i = 0; i < 5; i++) {
//            String x = scanner.nextLine();
//            strings[i] = x;
//        }
//
//        System.out.println("시작하는 문자 1개 입력");
//        String x = scanner.nextLine();
//        for (String iter : strings) {
//            if (iter.startsWith(x)){
//                System.out.println(iter);
//            }
//        }
        
        // 3. 배열 정렬
        System.out.println("\n===== 배열 정렬 =====");
        
        // TODO: 사용자로부터 5개의 정수를 입력받아 배열에 저장한 후, 오름차순으로 정렬하여 출력하세요.
        // 힌트: 이중 반복문을 사용하여 버블 정렬 알고리즘을 구현하거나, Arrays.sort()를 활용하세요.
//        int[] numbers = new int[5];
//        System.out.println("정수 5개 입력");
//        for (int i = 0; i < 5; i++) {
//            numbers[i] = scanner.nextInt();
//        }
//
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i+1; j < numbers.length; j++) {
//                if (numbers[i] > numbers[j]) {
//                    int temp = numbers[i];
//                    numbers[i] = numbers[j];
//                    numbers[j] = temp;
//                }
//            }
//        }
//
//        for (int iter : numbers) {
//            System.out.println(iter);
//        }
        
        // 4. 2차원 배열을 이용한 행렬 덧셈
        System.out.println("\n===== 2차원 배열을 이용한 행렬 덧셈 =====");
        
        // TODO: 두 개의 2x3 행렬을 입력받아 행렬 덧셈을 수행하고 결과를 출력하세요.
        // 힌트: 중첩 반복문을 사용하세요.
//        int[][] numbersA = new int[2][3];
//        int[][] numbersB = new int[2][3];
//
//        System.out.println("A행렬 숫자 6개 입력");
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                numbersA[i][j] = scanner.nextInt();
//            }
//        }
//
//        System.out.println("B행렬 숫자 6개 입력");
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                numbersB[i][j] = scanner.nextInt();
//            }
//        }
//
//        System.out.println("결과");
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.println("[" + i + "]" + "[" + j + "] = " + (numbersA[i][j] + numbersB[i][j]));
//            }
//        }

        // 5. 배열을 이용한 간단한 데이터 분석
        System.out.println("\n===== 배열을 이용한 데이터 분석 =====");
        
        // TODO: 10개의 정수를 입력받아 배열에 저장한 후, 최댓값, 최솟값, 중앙값(또는 평균)을 계산하여 출력하세요.
        // 힌트: 정렬을 활용하면 중앙값을 쉽게 찾을 수 있습니다.
        int[] numbers = new int[10];
        System.out.println("숫자 10개 입력");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println("최댓값: " + numbers[9]);
        System.out.println("최솟값: " + numbers[0]);
        System.out.println("중앙값: " + numbers[4]);

        scanner.close();
    }
} 