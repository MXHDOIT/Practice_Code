import java.util.Scanner;

public class ArrayMulArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[2][4];
        int[][] brr = new int[4][3];

        int[][] crr = new int[arr.length][brr[0].length];

        //初始化arr数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        //初始化brr数组
        for (int i = 0; i < brr.length; i++) {
            for (int j = 0; j < brr[i].length; j++) {
                brr[i][j] = in.nextInt();
            }
        }
        //arr*brr

        for(int i = 0;i < crr.length;i++){
            for(int j = 0; j< crr[0].length;j++){
                for(int k = 0;k < arr[0].length;k++){
                    crr[i][j]  += arr[i][k]+brr[k][j];
                }
            }
        }

        for(int i = 0;i < crr.length;i++){
            for(int j = 0;j < crr[i].length;j++){
                System.out.print(crr[i][j] +" ");
            }
            System.out.println();
        }
    }
}
