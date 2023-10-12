package control;

public class SumAllNumbers {
    /***
     * 요약: int 타입의 변수에 저장된 숫자의 각 자리수를 더한 합 구하기
     * 제어문을 활용하여 숫자로 처리
     */
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;

        while(num/10 > 0){
            sum += num%10;
            num /= 10;
        }
        sum += num;

        System.out.println("sum="+sum);
    }
}
