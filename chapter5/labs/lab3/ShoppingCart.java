package chapter5.labs.lab3;

import java.util.ArrayList;
import java.util.List;

/**
 * Lab 3: 인터페이스 활용하기
 * 
 * ShoppingCart 클래스를 정의하세요.
 * 이 클래스는 Buyable 인터페이스를 구현한 다양한 상품을 담는 장바구니 역할을 합니다.
 */
public class ShoppingCart {
    // TODO: 상품 목록을 저장할 리스트 선언
    private final ArrayList<Buyable> items;
    private int totalPrice;
    
    // TODO: 생성자 정의
    public ShoppingCart() {
        this.items = new ArrayList<>();
        this.totalPrice = 0;
    }
    
    // TODO: 장바구니에 상품 추가하는 메소드 구현
    public void addItem(Buyable item) {
        items.add(item);
        totalPrice += item.getPrice();
    }

    // TODO: 장바구니에서 상품 제거하는 메소드 구현
    public void removeItem(Buyable item) {
        items.remove(item);
        totalPrice -= item.getPrice();
    }
    
    // TODO: 장바구니의 총 금액을 계산하는 메소드 구현
    public void getTotalPrice() {
        System.out.println("장바구니에 담긴 모든 상품 가격은 : " + totalPrice);
    }
    
    // TODO: 장바구니 상품 목록을 출력하는 메소드 구현
    public void getList() {
        int sequence = 1;
        for (Buyable item : items) {
            if (item != null) {
                System.out.println(sequence + "번째 아이템은 : " + item.getTitle());
                sequence++;
            }
        }
    }

    public void findDiscountable() {
        for (Buyable item : items) {
            if (item instanceof Discountable) {
                System.out.println(item.getTitle() + "은(는) 할인 상품입니다.");
            }
        }
    }

}