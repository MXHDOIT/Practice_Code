import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SpareArray {
    public static void main(String[] args) {
        // 创建一个原始的二维数组 11 * 11
        // 0: 表示没有棋子， 1 表示 黑子 2 表蓝子
        int[][] arr = new int[11][11];
        arr[1][2] = 1;
        arr[2][3] = 2;
        arr[2][4] = 2;

        System.out.println("原始的二维数组");
        for(int[] row :arr){
            for(int data:row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

        //将二维数组转换为稀疏矩阵
        //1.统计棋子的个数
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] != 0){
                    sum++;
                }
            }
        }

        //2.创建稀疏矩阵
        int[][] brr = new int[sum+1][3];
        brr[0][0] = arr.length;
        brr[0][1] = arr[0].length;
        brr[0][2] = sum;

        //3.转换
        int count= 0; //记录行

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] != 0){
                    count++;
                    brr[count][0] = i;
                    brr[count][1] = j;
                    brr[count][2] = arr[i][j];
                }
            }
        }

        //4.输出稀疏矩阵
        for(int i = 0; i < brr.length;i++){
            System.out.printf("%d\t%d\t%d\t\n",brr[i][0],brr[i][1],brr[i][2]);
        }

        //稀疏--》原始
        int[][] crr= new int[brr[0][0]][brr[0][1]];

        for(int i = 1; i < brr.length;i++){
            crr[brr[i][0]][brr[i][1]] = brr[i][2];
        }

        for(int[] row :crr){
            for(int data:row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }


        FileWriter fw = null;

        try {
            fw = new FileWriter("map.txt");

            for(int i = 0;i < brr.length;i++){
                for(int j =0;j<3;j++){
                    fw.write(brr[i][j]);
                }
            }
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileReader fr = null;
        int[][] brr2 = new int[sum+1][3];
        try {
            fr = new FileReader("map.txt");

            for(int i = 0;i< brr.length;i++){
                for(int j = 0;j < 3;j++){
                    brr2[i][j] = fr.read();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
