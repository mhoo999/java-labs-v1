package chapter5.labs.lab2;

/**
 * Lab 2: 추상 클래스 활용하기
 * 
 * 여러 동물 객체를 생성하고, 각 동물의 정보와 소리를 출력하는 테스트 클래스입니다.
 */
public class AnimalTest {
    public static void main(String[] args) {
        System.out.println("Lab 2: 추상 클래스 활용하기 실습");
        
        // TODO: Dog 객체 생성
        Dog dog = new Dog("밍키", 2, "닥스훈트");
        
        // TODO: Cat 객체 생성
        Cat cat = new Cat("키키", 1, "코숏 고등어");
        
        // TODO: Bird 객체 생성
        Bird bird = new Bird("제이크", 5, 12, "앵무새");
        
        // TODO: 각 동물의 정보와 소리 출력
        dog.getSound();
        cat.getSound();
        bird.getSound();

        // TODO: 배열을 사용하여 여러 Animal 객체 관리하기
        Animal[] animals = new Animal[3];
        animals[0] = dog;
        animals[1] = cat;
        animals[2] = bird;
        
        // TODO: 모든 동물에 대해 반복하여 정보와 소리 출력하기
        for (Animal animal : animals) {
            animal.getInfo();
            animal.getSound();
            System.out.println();
        }
    }
} 