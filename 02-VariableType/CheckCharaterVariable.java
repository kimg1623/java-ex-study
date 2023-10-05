public class CheckCharaterVariable {
    public static void main(String[] args) {

        /* 변수 ch가 영문자 또는 "1의 자리 숫자"일 때만 변수 b의 값이 true */

        char ch = 'z';
        boolean b = ('A'<=ch&&ch<='Z')||('a'<=ch&&ch<='z')||(0<=ch&&ch<=9)?true:false;

        System.out.println(b);
    }
}
