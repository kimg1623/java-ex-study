public class ValidateStringOrNumber {
    /***
     * 요약: 숫자로 이루어진 문자열에서 모든 숫자의 합 구하기
     * String.charAt(int i) 메소드 활용
     */
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;
        for (int i=0; i < str.length(); i++) {
            sum += str.charAt(i)-48;    // 숫자 ASCII 코드 '1'==49
        }
        System.out.println("sum="+sum);
    }
}
