package oop;
/***
 * 요약 : 부모 클래스 참조변수와 자식클래스 참조변수에 따른 접근
 * 부모 클래스 참조변수가 자식 클래스 객체를 참조할 때
 * 1) 인스턴스 변수는 참조변수 타입에 선언된 변수에 접근
 * 2) 메서드는 자식 클래스에서 오버라이드된 메서드 호출
 */

public class InheritanceClassTest {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();
        System.out.println("p.x = " + p.x); // p.x = 100
        p.method();                         // Child Method
        System.out.println("c.x = " + c.x); // c.x = 200
        c.method();                         // Child Method
    }
}
class Parent {
    int x = 100;
    void method() {
        System.out.println("Parent Method");
    }
}
class Child extends Parent {
    int x = 200;
    void method() {
        System.out.println("Child Method");
    }
}