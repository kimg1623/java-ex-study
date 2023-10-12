package array;

public class DrawingStars {
    /***
     * 요약: 배열 answer에 담긴 데이터를 읽고 각 숫자의 갯수를 세어서 *로 그래프 만들기
     * answer는 1~4까지의 정수가 있는 배열
     */
    public static void main(String[] args) {
        int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
        int[] counter = new int[4];

        for (int i = 0; i < answer.length; i++) {
            counter[answer[i] - 1]++;
            // counter 위치에 answer값을 넣어야 함, 배열은 0부터 시작하므로 -1
        }

        for (int i = 0; i < counter.length; i++) {
            System.out.print(counter[i]);
            for (int j = 0; j < counter[i]; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
