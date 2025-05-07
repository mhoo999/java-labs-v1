package chapter4.labs.lab2;

/**
 * Lab 2: 생성자 활용하기
 * 
 * Book 클래스 정의하기
 */
public class Book {
    // TODO: 제목, 저자, 가격, 출판연도를 저장할 수 있는 필드를 정의하세요.
    private String title;
    private String writer;
    private int price;
    private int publishYear;

    // TODO: 기본 생성자를 정의하세요.
    public Book() {
        this.title = null;
        this.writer = null;
        this.price = 0;
        this.publishYear = 0;
    }

    // TODO: 제목만 인자로 받는 생성자를 정의하세요. (this() 사용)
    public Book(String title) {
        this.title = title;
        this.writer = null;
        this.price = 0;
        this.publishYear = 0;
    }

    // TODO: 제목과 저자를 인자로 받는 생성자를 정의하세요. (this() 사용)
    public Book(String title, String writer) {
        this.title = title;
        this.writer = writer;
        this.price = 0;
        this.publishYear = 0;
    }
    
    // TODO: 제목, 저자, 가격을 인자로 받는 생성자를 정의하세요. (this() 사용)
    public Book(String title, String writer, int price) {
        this.title = title;
        this.writer = writer;
        this.price = price;
        this.publishYear = 0;
    }

    // TODO: 모든 필드를 인자로 받는 생성자를 정의하세요.
    public Book(String title, String writer, int price, int publishYear) {
        this.title = title;
        this.writer = writer;
        this.price = price;
        this.publishYear = publishYear;
    }
    
    // TODO: 책의 정보를 출력하는 메소드를 정의하세요.
    public void getBookInfo() {
        System.out.println("제목 : " + title);
        System.out.println("저자 : " + writer);
        System.out.println("가격 : " + price);
        System.out.println("출판 연도 : " + publishYear);
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
    
} 