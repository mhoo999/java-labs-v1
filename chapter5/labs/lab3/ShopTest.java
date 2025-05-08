package chapter5.labs.lab3;

/**
 * Lab 3: 인터페이스 활용하기
 * 
 * 인터페이스 구현과 다형성을 테스트하는 클래스입니다.
 */
public class ShopTest {
    public static void main(String[] args) {
        System.out.println("Lab 3: 인터페이스 활용하기 실습");
        
        // TODO: Book 객체 생성
        Book bookA = new Book("어린왕자", 12000, "생택쥐페리");
        
        // TODO: Electronics 객체 생성
        Electronics electronics = new Electronics("아이폰16", 1300000, "애플");
        
        // TODO: DiscountedBook 객체 생성
        Book bookB = new DiscountedBook("삼국지:조조전", 15000, "유명훈", 30.0);
        
        // TODO: ShoppingCart 객체 생성
        ShoppingCart shoppingCart = new ShoppingCart();
        
        // TODO: 장바구니에 상품 추가하기
        shoppingCart.addItem(bookA);
        shoppingCart.addItem(electronics);
        shoppingCart.addItem(bookB);

        // TODO: 장바구니 내용과 총액 출력하기
        shoppingCart.getList();
        shoppingCart.getTotalPrice();
        
        // TODO: 인터페이스를 활용한 다형성 테스트
        //       - Buyable 타입 배열에 다양한 상품 담기
        //       - 모든 상품의 정보 출력하기
        
        
        // TODO: Discountable 인터페이스를 구현한 객체만 별도로 처리하기
        shoppingCart.findDiscountable();
        
    }
} 