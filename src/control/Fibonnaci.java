package control;

public class Fibonnaci {
    /***
     * 요약: 피보나치 수열의 10번째 숫자까지 출력하기
     * 1,1,2,3,5,8,13,21,34,55
     */
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;
        int num3 = 0; // 세번째 값
        System.out.print(num1+","+num2);
        for (int i = 0 ; i < 8 ; i++ ) {
            num3 = num1 + num2;
            System.out.print(","+num3);
            num1 = num2; num2 = num3;
        }
    }
}
