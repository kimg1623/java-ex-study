package oop;

import lombok.Getter;
import lombok.Setter;

/***
 * 요약: TV 클래스의 멤버변수를 클래스 외부에서 접근할 수 없도록 하기
 * 필드에 제어자 붙이기
 * getter setter 메서드 추가 (lombok 사용함)
 * void gotoPrevChannel() 메서드 추가 : 현재채널을 이전채널로 변경하기
 */

@Getter
@Setter
class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private final int MAX_VOLUME = 100;
    private final int MIN_VOLUME = 0;
    private final int MAX_CHANNEL = 100;
    private final int MIN_CHANNEL = 1;

    public void gotoPrevChannel(){
        if(this.channel==MIN_CHANNEL)
            this.channel=MAX_CHANNEL;
        else
            this.channel--;
    }
}

public class Tv2Example {
    public static void main(String args[]) {
        MyTv2 t = new MyTv2();
        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setVolume(20);
        System.out.println("VOL:"+t.getVolume());

        // gotoPrevChannel() 메서드 추가 이후 작성한 코드
        t.setChannel(20);
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
    }
}
