package oop;

/**
 * 요약 : 클래스를 멤버변수로 가질 때 내부 클래스의 메서드 사용하기
 * 내부 클래스의 메서드에서 외부 클래스의 필드에 접근하기 위해서는
 * '외부클래스이름.this.변수이름'으로 접근해야 한다.
 */
class Outer {
    int value=10;
    class Inner {
        int value=20;
        void method1() {
            int value=30;
            System.out.println(value);  // 메서드의 지역변수
            System.out.println(this.value); // Inner 클래스의 지역변수
            System.out.println(Outer.this.value);
            // 외부 클래스의 인스턴스 변수는 내부클래스에서 '외부클래스.this.변수이름'으로 접근할 수 있다.
        }
    } // Inner클래스의 끝
} // Outer클래스의 끝
public class InnerClassMethodExample {
    public static void main(String args[]) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.method1();
    }
}
