package chapter4.labs.lab3;

import java.lang.Math;

/**
 * Lab 3: static과 final 키워드 사용하기
 * 
 * Calculator 클래스 정의하기
 */
public class Calculator {
    // TODO: PI 값을 나타내는 static final 상수를 정의하세요.
    static final double pi = 3.14;
    
    // TODO: 인스턴스 변수를 정의하세요. (계산기 모델명, 계산 횟수 등)
    String model;
    int computeCount;
    
    // TODO: 계산기 객체의 총 개수를 나타내는 static 변수를 정의하세요.
    static int totalCalculator = 0;
    
    // TODO: 생성자를 정의하고, 객체가 생성될 때마다 계산기 개수를 증가시키세요.
    public Calculator(String model, int computeCount) {
        this.model = model;
        this.computeCount = computeCount;
        totalCalculator++;
    }
    
    // TODO: 원의 면적을 계산하는 static 메소드를 정의하세요.
    static public double areaOfCircle(double radius) {
        return Math.pow(radius * pi, 2);
    }
    
    // TODO: 원의 둘레를 계산하는 static 메소드를 정의하세요.
    static public double circumferenceOfCircle(double radius) {
        return 2 * (radius * pi);
    }
    
    // TODO: 사각형의 면적을 계산하는 static 메소드를 정의하세요.
    static public double areaOfRectangle(double width, double height) {
        return width * height;
    }
    
    // TODO: 인스턴스 메소드를 정의하고, 해당 메소드가 호출될 때마다 계산 횟수를 증가시키세요.
    public void calculateCount() {
        this.computeCount++;
    }
    
    // TODO: 계산기의 정보를 출력하는 메소드를 정의하세요.
    public void getInfo() {
        System.out.println("계산기 모델명 : " + model);
        System.out.println("계산 횟수 : " + computeCount);
    }
    
    // TODO: 현재까지 생성된 계산기의 총 개수를 반환하는 static 메소드를 정의하세요.
    static public void getTotalCalculator() {
        System.out.println("모든 계산기 갯수 : " + totalCalculator);
    }
    
} 