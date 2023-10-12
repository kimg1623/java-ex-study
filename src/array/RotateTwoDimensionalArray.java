package array;

public class RotateTwoDimensionalArray {
    /***
     * 요약: 주어진 배열을 시계방향으로 90도 회전시켜서 출력
     * 주어진 배열은 2차원 배열
     */
    public static void main(String[] args) {
        char[][] star = {
                {'*', '*', ' ', ' ', ' '},
                {'*', '*', ' ', ' ', ' '},
                {'*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*'}
        };
        char[][] result = new char[star[0].length][star.length];

        //원래 배열 상태 출력
        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                System.out.print(star[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        //시계 방향으로 90도 회전
        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
//              before
//                00 01 02 03 04
//                10 11 12 13 14
//                20       23 24
//                30       33 34
//              after
//                00 01 02 03
//                10 11 12 13
//                20       23
//                30       33
//                40       43
                result[j][star.length-1-i] = star[i][j];
            }
        }

        //회전된 배열 상태 출력
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}
