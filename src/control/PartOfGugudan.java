package control;

public class PartOfGugudan {
    /***
     * 요약: 구구단 일부만 출력하기
     */
    public static void main(String[] args) {
        for(int k=0;k<3;k++) {
            for(int j=1; j<=3 ; j++) {
                for(int i=2+(k*3); i<=4+(k*3)&&i<=9; i++) {
                    System.out.print(i+" x "+j+" = "+ String.format("%2d", i*j) + "   ");
                    //System.out.printf("%d x %d = %2d  ",i,j,i*j);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
