package ex.study.VariableType;

public class FixVariableType {
    public static void main(String[] args) {

        /*
            코드 문제점 수정
         */
        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b);// 문제점1 : 정수 연산시 int => 연산 후 byte로 형변환 필요
        char ch = 'A';
        ch = (char) (ch + 2);   // 문제점2 : 'A'는 정수로 연산 가능 => ch형인 char로 형변환 필요
        float f = 3f / 2;       // 문제점3 : 연산시 적어도 1개의 피연산자가 실수형이어야 함
        long l = 3000L * 3000 * 3000; // 문제점4 : 연산지 적어도 1개의 피연산자가 Long 타입이어야 함
        float f2 = 0.1f;
        double d = 0.1;
        boolean result = (float) d==f2;// 문제점5 : float형과 double형을 비교하기 위해서는 형을 맞춰야 함
        System.out.println("c="+c);
        System.out.println("ch="+ch);
        System.out.println("f="+f);
        System.out.println("l="+l);
        System.out.println("result="+result);
    }
}
