package oop;
public class GetAbs {
    /***
     * 요약 : 주어진 값의 절대값을 반환
     * int abs(int value) 메서드 작성
     */
    public static int abs(int value){
        return (value<0)?-value:value;
    }
    public static void main(String[] args)
    {
        int value = 5;
        System.out.println(value+"의 절대값:"+abs(value));
        value = -10;
        System.out.println(value+"의 절대값:"+abs(value));
    }
}
