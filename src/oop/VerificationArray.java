package oop;
public class VerificationArray {
    /***
     * 요약 : 주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다.
     * 모두 숫자로만 이루어져 있으면 true를 반환하고,
     * 그렇지 않으면 false를 반환한다.
     * 만일 주어진 문자열이 null이거나 빈문자열“”이라면 false를 반환한다.
     */
    public static boolean isNumber(String str){
        if (str == null) return false;
        if (str.isEmpty()) return false;
        for(int i=0;i<str.length();i++) {
            if (str.charAt(i) < '1' || str.charAt(i) > '9')
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "123";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));
        str = "1234o";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));
    }
}
