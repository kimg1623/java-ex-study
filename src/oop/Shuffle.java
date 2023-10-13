package oop;

public class Shuffle {
    /***
     * 요약: 주어진 배열의 담긴 값의 위치를 섞는다.
     * int[] shuffle (int[] arr) 메소드 정의
     */

    public static int[] shuffle (int[] arr){
        for(int i = 0; i<arr.length; i++){
            int idx = (int)(Math.random()*arr.length);
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }
    public static void main(String[] args)
    {
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));
        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}
