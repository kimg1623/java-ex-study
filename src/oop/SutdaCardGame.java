package oop;
/***
 * 요약 : 섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스) 정의
 * SutdaCard 클래스는 숫자와 광 필드로 정의되어 있다.
 * Deck 생성자 구현
 * SutdaCard shuffle(int index) 구현
 * SutdaCard shuffle() 구현
 */
class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];
    SutdaDeck() {
        for(int i =0; i<CARD_NUM; i++) {
            if(i==0||i==2||i==7)
                cards[i] = new SutdaCard(i+1,true);
            else if(i>=10)
                cards[i] = new SutdaCard(i-9,false);
            else
                cards[i] = new SutdaCard(i+1,false);
        }
    }
    public void shuffle(){
        for(int i=0;i<CARD_NUM;i++){
            int random = (int)(Math.random()*20);
            SutdaCard tmp = cards[i];
            cards[i] = cards[random];
            cards[random] = tmp;
        }
    }
    public SutdaCard pick(int index){
        if(index < 0 || index >= CARD_NUM)  // index 유효성 검사
            return null;
        return cards[index];
    }
    public SutdaCard pick(){
        int index = (int)(Math.random()* cards.length);
        return pick(index); // 기존의 pick(int index) 호출하여 재사용성 높이기
    }
}
class SutdaCard {
    final int NUM;  // 값이 한번 지정되면 바뀌지 않도록 제한
    final boolean IS_KWANG; // 값이 한번 지정되면 바뀌지 않도록 제한
    SutdaCard() {
        this(1, true);
    }
    SutdaCard(int num, boolean isKwang) {
        this.NUM = num;             // 생성자에서 단 한 번의 초기화만 가능
        this.IS_KWANG = isKwang;    // 생성자에서 단 한 번의 초기화만 가능
    }
    // info()대신 Object클래스의 toString()을 오버라이딩
    public String toString() {
        return NUM + ( IS_KWANG ? "K":"");
    }
}
public class SutdaCardGame {
    public static void main(String args[]) {
        SutdaDeck deck = new SutdaDeck();
        for(int i=0; i < deck.cards.length;i++)
            System.out.print(deck.cards[i]+",");
        System.out.println();
        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();
        for(int i=0; i < deck.cards.length;i++)
            System.out.print(deck.cards[i]+",");
        System.out.println();
        System.out.println(deck.pick(0));
    }
}