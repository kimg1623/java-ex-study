package oop;

import java.awt.*;
import java.awt.event.*;

/**
 * 요약 : 자바 클래스를 익명 클래스로 만들어 사용하기
 * 한번 사용할 클래스는 추가할 메소드를 바로 정의하여 사용할 수 있다.
 */
public class AnonymousClassExample {
    public static void main(String[] args)
    {
        Frame f = new Frame();
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                e.getWindow().setVisible(false);
                e.getWindow().dispose();
                System.exit(0);
            }
        });
    } // main
}

/* 외부 클래스를 익명 클래스로 사용하기
class EventHandler extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        e.getWindow().setVisible(false);
        e.getWindow().dispose();
        System.exit(0);
    }
}
*/