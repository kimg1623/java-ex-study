package oop;
/***
 * 요약 : Product클래스를 상속받은 제품들을 Buyer클래스에서 메서드로 구입
 * void buy(Product p) : buyer.money과 p.price를 비교하여 차액 계산, add()메서드 호출
 * void add(Product p) : buyer.Product[]배열에 Product 객체 저장
 * void summary() : 장바구니 목록, 구매 금액, 남은 금액 출력
 */
public class BuyerExample {
    public static void main(String args[]) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());
        b.summary();
    }
}
class Buyer { // 물건을 구입하는 사람을 정의
    int money = 1000;
    Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
    int i = 0; // Product 배열 cart에 사용될 index
    void buy(Product p) {
        if(money<p.price) { // 가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드 종료
            System.out.println("잔액이 부족하여 " + p + "을/를 살 수 없습니다.");
            return;
        } // 돈이 적으면 메서드를 바로 종료하기 때문에 if만 단독 사용
        money -= p.price;
        add(p); // 장바구니에 물건 담기

    }
    void add(Product p) {   // cart 장바구니에 물건을 담는 메서드
        if (i >= cart.length){  //  i값이 장바구니 크기(cart배열) 보다 크면
            Product[] newCart = new Product[cart.length*2]; // 기존 장바구니보다 2배 큰 새로운 배열 생성
            System.arraycopy(cart,0, newCart, 0, cart.length);  // 기존 장바구니의 내용을 새로운 배열에 복사
            cart = newCart; // 새로운 장바구니와 기존 장바구니를 바꾸기
        }
        cart[i++] = p;  // 물건을 장바구니에 저장 후 i값 1증가

    } // add(Product p)
    void summary() { // 구입한 목록, 구입금액, 잔고 출력 메서드
        // 구입한 물건들의 목록 만들기
        System.out.print("구입한 물건: ");
        int sum = 0;
        for(Product i : cart) {
            System.out.print(i + ",");
            sum += i.price; // 구입한 물건들의 가격 더하기
        }
        System.out.println();
        System.out.println("사용한 금액: "+sum); // 전체 구입 금액 출력
        System.out.println("남은 금액: "+money); // 잔고 출력

    } // summary()
}
class Product {
    int price; // 제품의 가격
    Product(int price) {
        this.price = price;
    }
}
class Tv extends Product {
    Tv() { super(100); }
    public String toString() { return "Tv"; }
}
class Computer extends Product {
    Computer() { super(200); }
    public String toString() { return "Computer";}
}
class Audio extends Product {
    Audio() { super(50); }
    public String toString() { return "Audio"; }
}