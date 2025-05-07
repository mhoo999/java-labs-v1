package chapter5.labs.lab1;

/**
 * Lab 1: 상속과 메소드 오버라이딩
 * 
 * 여러 도형 객체를 생성하고, 각 도형의 면적을 계산하고 출력하는 테스트 클래스입니다.
 */
public class ShapeTest {
    public static void main(String[] args) {
        System.out.println("Lab 1: 상속과 메소드 오버라이딩 실습");
        
        // TODO: Rectangle 객체 생성
        Rectangle rectangle = new Rectangle("사각형", "녹색", 5, 3);
        
        // TODO: Circle 객체 생성
        Circle circle = new Circle("원", "노랑", 5);

        // TODO: 각 도형의 정보 출력 및 면적 계산
        rectangle.getInfo();
        circle.getInfo();
        
        // TODO: 배열을 사용하여 여러 Shape 객체 관리하기
        Shape[] shapeArray = new Shape[2];
        shapeArray[0] = rectangle;
        shapeArray[1] = circle;
        
        // TODO: 모든 도형의 면적 합계 계산하기
        double totalArea = 0;
        for (Shape shape : shapeArray) {
            totalArea += shape.getArea();
        }
        System.out.println(totalArea);

    }
} 