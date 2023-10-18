package oop;

/***
 * 요약 : void action(Robot r)메서드를 선언하여 Robot클래스 내부 메소드 실행
 * main에서 실행될 메서드이기 때문에 static 선언
 * 매개변수로 Robot을 받아 사용하므로 자식 클래스의 메서드를 사용할 때는 다운캐스팅
 */
public class RobotExample {
    public static void action(Robot r){ // Robot 부모 클래스
        if (r instanceof DanceRobot)    // instanceof 클래스
            ((DanceRobot) r).dance();   // 다운 캐스팅
        else if (r instanceof SingRobot) {
            ((SingRobot) r).sing();     // 다운 캐스팅
        }
        else
            ((DrawRobot)r).draw();      // 다운 캐스팅
    }
    public static void main(String[] args) {
        Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
        for(int i=0; i< arr.length;i++)
            action(arr[i]);
    } // main
}
class Robot {}
class DanceRobot extends Robot {
    void dance() {
        System.out.println("춤을 춥니다.");
    }
}
class SingRobot extends Robot {
    void sing() {
        System.out.println("노래를 합니다.");
    }
}
class DrawRobot extends Robot {
    void draw() {
        System.out.println("그림을 그립니다.");
    }
}
