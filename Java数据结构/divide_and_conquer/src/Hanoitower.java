/**
 * 分治算法解决汉诺塔
 */
public class Hanoitower {
    public static void main(String[] args) {
        hanoiTower(5,'A','B','C');
    }

    public static void hanoiTower(int num,char a,char b,char c){
        if(num == 1){
            move(num,a,c);
            return ;
        }
        hanoiTower(num-1,a,c,b);
        move(num,a,c);
        hanoiTower(num-1,b,a,c);
    }

    public static void move(int num,char a,char c){
        System.out.println("第"+num+"个盘"+a+"->"+c);
    }
}
