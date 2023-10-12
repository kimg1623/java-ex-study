package array;

public class Encoding {
    /***
     * 요약: 알파벳과 숫자 암호표로 암호화
     */
    public static void main(String[] args) {
                        // a97  b    c
        char[] abcCode = {'`', '~', '!', '@', '#', '$', '%', '^', '&', '*',
                        '(', ')', '-', '_', '+', '=', '|', '[', ']', '{',
                        '}', ';', ':', ',', '.', '/'};

                        // 0(48)1    2    3    4    5    6    7    8    9
        char[] numCode = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
        String src = "abc123";
        String result = "";

        // 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);
            if(ch>=97 && ch<=123)
                result += abcCode[ch - 97];
            if(ch>=48 && ch<=57)
                result += numCode[ch - 48];
        }

        System.out.println("src:" + src);
        System.out.println("result:" + result);
    }
}
