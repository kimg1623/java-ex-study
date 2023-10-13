package oop;

class MyPoint {
    int x;
    int y;

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    double getDistance(int x1, int y1) {
        return Math.sqrt((double)(x1-x)*(x1-x)+(y1-y)*(y1-y));
    }
}
public class GetDisatanceBetweenCoordinate {
    /***
     * 요약: 두 점(x,y)와 (x1,y1)간의 거리 구하기
     * 클래스와 메소드로 구현
     */
    public static void main(String args[]) {
        MyPoint p = new MyPoint(1,1);
        System.out.println(p.getDistance(2,2));
    }
}
