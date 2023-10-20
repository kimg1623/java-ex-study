package oop;
/**
 * 요약 : 클래스를 멤버변수로 가질 때 내부 클래스의 멤벼변수에 접근하기
 * 1) 내부 클래스가 일반 클래스일 때
 * 2) 내부 클래스에 static이 선언되어 있을 때
 */

class Outer1 {  // 일반 클래스(외부)
    class Inner1 { // 일반 클래스(내부)
        int iv=100;
    }
}
class Outer2 { // 일반 클래스(외부)
    static class Inner2 { // static 클래스(내부)
        int iv=200;
    }
}
public class InnerClassExample {
    public static void main(String[] args) {
        /* 1) Outer 클래스의 내부 클래스 Inner의 멤버변수 iv의 값 출력 */
        Outer1 o1 = new Outer1();
        Outer1.Inner1 i1 = o1.new Inner1(); //내부 클래스 변수를 불러와서 외부참조변수에서 할당받아야함
        System.out.println(i1.iv);

        /* 2) Outer 클래스의 내부 static 클래스 Inner의 멤버변수 iv의 값 출력 */
        Outer2.Inner2 i2 = new Outer2.Inner2();
        System.out.println(i2.iv);

        /* 차이 : 내부 클래스에 접근하기 위해서 생성해야 할 인스턴스 알기 */
    }
}
