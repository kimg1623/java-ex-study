package oop;
/***
 * 요약 : 추상 클래스를 상속받아 자식 클래스 구현
 * 추상 클래스에서 선언한 추상 메서드는 상속받았을 때 무조건 구현해야 한다.
 * 1) Circle 클래스: 멤버변수 double r
 * 2) Rectangle 클래스 : 멤버변수 double width, double height
 *                      메서드 boolean isSquare()
 */

abstract class Shape {
    Point p;
    Shape() {
        this(new Point(0,0));
    }
    Shape(Point p) {
        this.p = p;
    }
    abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드
    Point getPosition() {
        return p;
    }
    void setPosition(Point p) {
        this.p = p;
    }
}
class Point {
    int x;
    int y;
    Point() {
        this(0,0);
    }
    Point(int x, int y) {
        this.x=x;
        this.y=y;
    }
    public String toString() {
        return "["+x+","+y+"]";
    }
}
class Circle extends Shape{
    double r; // 반지름
    Circle(double r){   // 객체를 생성할 때 반지름만 입력 받은 경우
        this(new Point(0,0),r);
    }
    Circle(Point p, double r){
        super(p);   // 부모 클래스의 생성자로 point 초기화
        this.r = r;
    }

    @Override
    double calcArea() {
        return r*r*3.14;
    }
}
class Rectangle extends Shape{
    double width;
    double height;
    Rectangle(double width, double height){
        super(new Point(0,0));
        this.width = width;
        this.height = height;
    }

    @Override
    double calcArea() {
        return width*height;
    }

    boolean isSquare(){
        // width나 height가 0이 아니고 width와 height가 같으면 true를 반환
        return width*height!=0 && width==height;
    }
}
public class ShapeExample {
    public static double sumArea(Shape[] arr){
        double sum = 0;
        for(Shape shape : arr){
            System.out.println(shape.calcArea());
            sum += shape.calcArea();
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
        System.out.println("면적의 합:"+sumArea(arr));
    }
}
