public class ChangeLargeToSmallCharacter {
    public static void main(String[] args) {

        /* 변수ch가 대문자인 경우에만 소문자로 변경 */

        char ch = 'A';
        char lowerCase = ('A'<=ch&&ch<='Z') ? (char)(ch+32) : ch;
        System.out.println("ch:"+ch);
        System.out.println("ch to lowerCase:"+lowerCase);
    }
}
