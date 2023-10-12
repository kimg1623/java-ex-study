package array;

public class CountCoinForChange {
    /***
     * 요약: 거스름돈을 위해 각각 몇개의 동전이 필요한지 계산
     * 조건: 나눗셈 연산자와 나머지 연산자를 사용
     */
    public static void main(String[] args) {
        // 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
        int[] coinUnit = {500, 100, 50, 10};

        int money = 2680;
        System.out.println("money="+money);

        for(int i=0;i<coinUnit.length;i++) {
            System.out.println(coinUnit[i]+"원: "+money / coinUnit[i]);
            money %= coinUnit[i];
        }
    }
}
