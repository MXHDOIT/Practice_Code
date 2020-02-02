import java.lang.reflect.Method;
import java.util.Queue;

/**
 * 8皇后问题
 */
public class Queue8 {
    //定义一个max表示多少个皇后
    int max = 8;
    //定义数组array，保存皇后放置位置的结果
    int[] array = new int[max];

    static int count = 0;
    public static void main(String[] args) {
        Queue8 queue8 = new Queue8();
        queue8.check(0);

        System.out.println("一共有"+count+"种解法");
    }

    //放置第n个皇后
    //特别注意：check是每一次递归时，进入check中都有for(int i = 0;i < max;i++),因此有回溯
    private void check(int n){
        if(n == max){   //n=8,其实8个皇后已经放好了
            print();
            return ;
        }

        //依次放置皇后，并判断是否冲突
        for(int i = 0;i< max;i++){
            //先把当前这个皇后n放置在到i
            array[n] = i;
            if(judge(n)){
                check(n+1);
            }
        }
    }

    //查看我们放置第n个皇后【传进来是n,实际是n+1个皇后】，就去检测该皇后是否和前面已经摆放的皇后冲突
    private boolean judge(int n){
        for(int i = 0;i < n;i++){
            //判断是否在一列或在一条斜线
            if(array[i] == array[n] || Math.abs(n-i) == Math.abs(array[n] - array[i])){
                return false;
            }
        }
        return true;
    }

    //写一个方法，可以将皇后摆放的位置输出
    private void print(){
        count++;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
