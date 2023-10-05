package ex.study.Operator;

public class TernaryOperator {
    public static void main(String[] args) {

        /* 삼항 연산자를 이용하여 num의 값 출력 */

        int num = -5;
        System.out.println(num>0 ? "양수" : num == 0 ? "0" : "음수");
    }
}
