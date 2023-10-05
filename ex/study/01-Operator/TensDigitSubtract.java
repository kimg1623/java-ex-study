package ex.study.Operator;

public class TensDigitSubtract {
    public static void main(String[] args) {

        /* num보다 크면서도 가장 가까운 10의 배수에서 num값을 뺀 값 */

        int num = 24;
        System.out.println(10 - num % 10);
    }
}
