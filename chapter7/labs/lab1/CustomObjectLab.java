package chapter7.labs.lab1;

import java.util.HashMap;
import java.util.Objects;

/**
 * Object 클래스의 메소드를 오버라이딩하는 실습
 * 
 * 이 실습에서는 Java의 Object 클래스에서 제공하는 기본 메소드를 오버라이딩하여
 * 커스텀 클래스의 동작을 정의하는 방법을 학습합니다.
 * - equals(): 객체의 동등성 비교
 * - hashCode(): 객체의 해시 코드 생성
 * - toString(): 객체의 문자열 표현
 */
public class CustomObjectLab {
    public static void main(String[] args) {
        // TODO: Book 객체를 세 개 생성하세요.
        // book1, book2는 동일한 ISBN을 가진 책
        // book3는 다른 ISBN을 가진 책
        Book bookA = new Book("1234", "어린왕자", "생택쥐페리", 12000);
        Book bookB = new Book("1234", "어린왕자", "생택쥐페리", 12000);
        Book bookC = new Book("1235", "삼국지:조조전", "유명훈", 16000);
        EBook eBook = new EBook("1234", "어린왕자", "생택쥐페리", 12000);

        // TODO: equals() 메소드 테스트
        // book1과 book2, book1과 book3, book1과 null, book1과 다른 타입 객체를 비교하세요.
        System.out.println("bookA와 bookB 비교 : bookA.equals(bookB) = " + bookA.equals(bookB));
        System.out.println("bookA와 bookC 비교 : bookA.equals(bookC) = " + bookA.equals(bookC));
//        System.out.println("bookA와 null 비교 : bookA.equals(null) = " + bookA.equals(null));
        System.out.println("bookA와 eBook 비교 : bookA.equals(eBook) = " + bookA.equals(eBook));

        // TODO: toString() 메소드 테스트
        // 각 Book 객체의 toString() 메소드 호출 결과를 출력하세요.
        System.out.println(bookA.toString());
        System.out.println(bookB.toString());
        System.out.println(bookC.toString());
        System.out.println(eBook.toString());

        // TODO: hashCode() 메소드 테스트
        // 각 Book 객체의 해시코드를 출력하고, book1과 book2의 해시코드가 같은지 확인하세요.
        System.out.println(bookA.hashCode());
        System.out.println(bookB.hashCode());
        System.out.println(bookC.hashCode());
        System.out.println(eBook.hashCode());

        // TODO: HashMap에서 Book 객체를 키로 사용하는 예제 코드를 작성하세요.
        // 1. HashMap<Book, String> 생성
        // 2. book1과 book3를 키로 하여 값 저장
        // 3. book1, book2, book3로 값 조회 시도
        HashMap<Book, String> hashMap = new HashMap<>();
        hashMap.put(bookA, bookA.getTitle());
        hashMap.put(bookB, bookB.getTitle());
        hashMap.put(bookC, bookC.getTitle());

        System.out.println(hashMap.get(bookA));
        System.out.println(hashMap.get(bookB));
        System.out.println(hashMap.get(bookC));


        // TODO: ArrayList에서 Book 객체의 존재 여부를 확인하는 예제 코드를 작성하세요.
        // 1. ArrayList<Book> 생성
        // 2. book1과 book3를 리스트에 추가
        // 3. book1, book2, book3가 리스트에 존재하는지 확인
    }
}

/**
 * Object 클래스의 주요 메소드를 오버라이딩할 Book 클래스입니다.
 */
class Book {
    // TODO: ISBN, 제목, 저자, 가격 필드를 선언하세요.
    String ISBN;
    String title;
    String writer;
    int price;

    // TODO: 모든 필드를 초기화하는 생성자를 작성하세요.
    public Book(String ISBN, String title, String writer, int price) {
        this.ISBN = ISBN;
        this.title = title;
        this.writer = writer;
        this.price = price;
    }

    // TODO: 필요한 Getter 메소드를 작성하세요.
    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getWriter() {
        return writer;
    }

    public int getPrice() {
        return price;
    }

    // TODO: equals() 메소드를 오버라이딩하여 ISBN이 같으면 동일한 책으로 판단하도록 구현하세요.
    // equals 메소드 구현 시 다음 사항을 고려하세요:
    // 1. 참조가 동일한지 확인 (this == obj)
    // 2. null 체크 및 타입 비교 (obj != null && getClass() == obj.getClass())
    // 3. 적절한 형변환 후 필드 비교
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() == obj.getClass()) return false;
        Book book = (Book) obj;
        return Objects.equals(this.ISBN, book.getISBN()) && Objects.equals(this.title, book.getTitle()) && Objects.equals(this.writer, book.getWriter()) && this.price == book.getPrice();
    }

    // TODO: hashCode() 메소드를 오버라이딩하여 equals와 일관되게 동작하도록 구현하세요.
    // ISBN이 같은 객체는 동일한 해시코드를 반환해야 합니다.
    // java.util.Objects.hash() 메소드를 활용하세요.
    @Override
    public int hashCode() {
        int result = this.ISBN.hashCode();
        result = 31 * result + title.hashCode();
        result = 31 * result + writer.hashCode();
        result = 31 * result + price;
        return result;
    }

    // TODO: toString() 메소드를 오버라이딩하여 Book 객체의 모든 필드 정보를 포함한 문자열을 반환하세요.
    @Override
    public String toString() {
        return "Product{ISBN='" + ISBN + "', title='" + title + "', writer='" + writer + "', price=" + price + "}";
    }

}
class EBook extends Book {
    String ISBN;
    String title;
    String writer;
    int price;

    // TODO: 모든 필드를 초기화하는 생성자를 작성하세요.
    public EBook(String ISBN, String title, String writer, int price) {
        super(ISBN, title, writer, price);
    }
}