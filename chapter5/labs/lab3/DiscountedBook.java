package chapter5.labs.lab3;

/**
 * Lab 3: 인터페이스 활용하기
 * 
 * DiscountedBook 클래스를 정의하세요.
 * 이 클래스는 Book 클래스를 상속받고 Discountable 인터페이스를 구현합니다.
 */
public class DiscountedBook extends Book implements Discountable {
    // TODO: 할인 관련 속성 추가 (예: 할인율)
    double discountRate;
    
    // TODO: 생성자 정의
    public DiscountedBook(String title, int price, String writer, double discountRate) {
        super(title, price, writer);

        this.discountRate = discountRate;
    }


    // TODO: Discountable 인터페이스의 메소드 구현
    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public double getDiscountedPrice() {
        return price * discountRate;
    }

    @Override
    public void getDiscountInfo() {
        System.out.println("할인율 : " + getDiscountRate());
        System.out.println("할인된 가격 : " + getDiscountedPrice());
    }

    
    // TODO: 필요한 경우 부모 클래스의 메소드 오버라이딩
    @Override
    public void skimThrough() {
        super.skimThrough();
        System.out.println("할인중이네.");
    }
} 