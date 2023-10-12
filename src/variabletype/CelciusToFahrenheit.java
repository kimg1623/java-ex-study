package variabletype;

public class CelciusToFahrenheit {
    public static void main(String[] args) {

        /*
            화씨 -> 섭씨 변환
            변환 공식 : C = 5/9 ×(F - 32)
            조건 : 소수점 셋째자리에서 반올림, Math.round() 사용하지 않고 처리할 것
         */

        int fahrenheit = 100;
        float celcius = 5f/9*(fahrenheit-32);
        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.printf("Celcius:%.2f",celcius);
    }
}
