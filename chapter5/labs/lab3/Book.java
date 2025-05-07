package chapter5.labs.lab3;

/**
 * Lab 3: 인터페이스 활용하기
 * 
 * Book 클래스를 정의하세요.
 * 이 클래스는 Buyable 인터페이스를 구현합니다.
 */
public class Book implements Buyable {
    // TODO: 책의 속성 정의 (예: 제목, 가격, 저자)
    String title;
    int price;
    String writer;


    // TODO: 생성자 정의
    public Book(String title, int price, String writer) {
        this.title = title;
        this.price = price;
        this.writer = writer;
    }


    // TODO: Buyable 인터페이스의 메소드 구현
    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void getInfo() {
        System.out.println("종류 : 책");
        System.out.println("제목 : " + title);
        System.out.println("가격 : " + price);
        System.out.println("저자 : " + writer);
    }


    // TODO: 책만의 고유한 메소드 추가
    public void skimThrough() {
        System.out.println(title + "을 훑어 본다.");
    }

} 