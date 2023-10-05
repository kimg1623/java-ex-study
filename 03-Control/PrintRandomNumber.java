public class PrintRandomNumber {
    /***
     * 요약: Math.random() 메소드 활용 실습
     * Math.random(): 0~1 사이의 부동소수점 난수(double) 생성
     * java.util.Random 클래스에서 nextInt(), nextDouble() 등 메소드로도 난수 생성 가능
     */
    public static void main(String[] args) {
        int value = (int)Math.floor(Math.random()*6)+1; // 1~6 사이의 정수 출력
        System.out.println("value:"+value);
    }
}
