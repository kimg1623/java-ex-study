package array;

public class SumTwoDimensionalArray {
    /***
     * 요약: 행과 열의 합 구하기
     * 주어진 배열은 2차원 배열
     */
    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 40, 40}
                , {50, 50, 50}
        };
        int[][] result = new int[score.length + 1][score[0].length + 1];
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                result[i][j] = score[i][j];                 //배열 복사
                result[i][score[0].length] += score[i][j];  //행 합계
                result[score.length][j] += score[i][j];     //열 합계
                result[score.length][score[0].length] += score[i][j]; //전체 합계
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.printf("%4d", result[i][j]);
            }
            System.out.println();
        }
    }
}
